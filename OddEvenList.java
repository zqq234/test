class OddEvenList {
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode even=head.next;
        ListNode cur=head;
        while(cur!=null&&cur.next!=null){
            ListNode tmp=cur.next;
            cur.next=tmp.next;
            cur=tmp;
        }
        cur=head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=even;
        return head;
    }
}