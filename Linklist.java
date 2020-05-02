public class Linklist {
    public static class Node{
        public int val;
        public Node next;
        public Node(int val){
            this.val=val;
        }
    }
    Node head;
    public void insertNode(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
        }else{
            node.next=head;
            head=node;
        }
    }
    public void print(){
        Node cur=head;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
    }
    public static void main(String[] args){
        Linklist mylist=new Linklist();
        mylist.insertNode(2);
        mylist.insertNode(4);
        mylist.insertNode(8);
        mylist.insertNode(1);
        mylist.print();
    }
}
