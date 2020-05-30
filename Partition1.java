class Partition {
    public ListNode partition(ListNode head, int x) {
        ListNode left=new ListNode(0);
        ListNode lt=left;
        ListNode right=new ListNode(0);
        ListNode rt=right;
        ListNode cur=head;
        while(cur!=null){
            if(cur.val<x){
                lt.next=cur;
                lt=lt.next;
            }else{
                rt.next=cur;
                rt=rt.next;
            }
            cur=cur.next;
        }
        lt.next=null;
        rt.next=null;
        lt.next=right.next;
        return left.next;
    }
}