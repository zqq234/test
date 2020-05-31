class ReverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode(-1);
        ListNode last=dummy;
        Stack<ListNode> s=new Stack<>();
        while(true){
            int count=0;
            ListNode tmp=head;
            while(tmp!=null&&count<k){
                s.push(tmp);
                tmp=tmp.next;
                count++;
            }
            if(count!=k){
                last.next=head;
                break;
            }
            while(!s.isEmpty()){
                last.next=new ListNode(s.pop().val);
                last=last.next;
            }
            head=tmp;
        }
        return dummy.next;
    }
}