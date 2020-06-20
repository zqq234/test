class LRUCache {
    private static class Node{
        int key;
        int value;
        Node pre;
        Node next;
        public Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
    Map<Integer,Node> map;
    int capacity
    Node head;
    Node tail;
    public LRUCache(int capacity) {
        map=new HashMap<>();
        this.capacity=capacity;
        head=new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;
        tail.pre=head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node tmp=map.get(key);
            int val=tmp.value;
            removeNode(tmp);
            addHead(tmp);
            return val;
        }else{
            return -1;
        }
    }
    public void removeNode(Node node){
        Node left=node.pre;
        Node right=node.next;
        right.pre=left;
        left.next=right;
        node.pre=null;
        node.next=null;
    }
    public void addHead(Node node){
        Node tmp=head.next;
        tmp.pre=node;
        head.next=node;
        node.next=tmp;
        node.pre=head;
    }
    public Node removeTail(){
        Node tmp=tail.pre;
        Node cur=tmp.pre;
        tail.pre=cur;
        cur.next=tail;
        tmp.pre=null;
        tmp.next=null;
        return tmp;
    }
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node tmp=map.get(key);
            tmp.value=value;
            removeNode(tmp);
            addHead(tmp);
        }else{
            if(map.size()==capacity){
                Node tmp=removeTail();
                int k=tmp.key;
                map.remove(k);
            }
            Node node=new Node(key,value);
            map.put(key,node);
            addHead(node); 
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */