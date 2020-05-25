class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode cur=head;
        ListNode prev=null;
        while(cur!=null){
            ListNode curNext=cur.next;
            cur.next=prev;
            prev=cur;
            cur=curNext;
        }
        return prev;
    }
}