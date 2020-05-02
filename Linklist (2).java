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
        System.out.println();
    }
    public void delete(int k){
        Node fast=head;
        while(fast!=null){
            fast=fast.next;
            k--;
        }
        if(k==0){
            head=head.next;
        }else if(k>0){
            return;
        }else{
            Node slow=head;
            while(++k!=0){
                slow=slow.next;
            }
            slow.next=slow.next.next;
        }
    }
    public static void main(String[] args){
        Linklist mylist=new Linklist();
        mylist.insertNode(2);
        mylist.insertNode(4);
        mylist.insertNode(8);
        mylist.insertNode(1);
        mylist.insertNode(5);
        mylist.insertNode(7);
        mylist.insertNode(3);
        mylist.insertNode(9);
        mylist.print();
        mylist.delete(8);
        mylist.print();
        mylist.delete(1);
        mylist.print();
        mylist.delete(4);
        mylist.print();
    }
}
