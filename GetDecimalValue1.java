class GetDecimalValue {
    public int getDecimalValue(ListNode head) {
        int sum=0;
        ListNode cur=head;
        while(cur!=null){
            sum=sum*2+cur.val;
            cur=cur.next;
        }
        return sum;
    }
}