class GetKthFromEnd {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode slow=head;
        ListNode fast=head;
        while(k!=0){
            if(fast==null){
                return null;
            }
            k--;
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}