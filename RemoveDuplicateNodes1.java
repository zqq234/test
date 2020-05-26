class RemoveDuplicateNodes1 {
    public ListNode removeDuplicateNodes(ListNode head) {
        ListNode cur=head;
        while(cur!=null){
            ListNode p=cur;
            while(p.next!=null){
                if(p.next.val==cur.val){
                    p.next=p.next.next;
                }else{
                    p=p.next;
                }
            }
            cur=cur.next;
        }
        return head;
    }
}