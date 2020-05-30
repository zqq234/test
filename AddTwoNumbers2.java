class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<ListNode> s1=new Stack<>();
        Stack<ListNode> s2=new Stack<>();
        while(l1!=null){
            s1.push(l1);
            l1=l1.next;
        }
        while(l2!=null){
            s2.push(l2);
            l2=l2.next;
        }
        int flag=0;
        int res=0;
        ListNode head=new ListNode(-1);
        while(!s1.isEmpty()||!s2.isEmpty()){
            int x=s1.isEmpty()?0:s1.pop().val;
            int y=s2.isEmpty()?0:s2.pop().val;
            res=x+y+flag;
            flag=res/10;
            ListNode node=new ListNode(res%10);
            node.next=head.next;
            head.next=node;
        }
        if(flag==1){
            ListNode node=new ListNode(flag);
            node.next=head.next;
            head.next=node;
        }
        return head.next;
    }
}