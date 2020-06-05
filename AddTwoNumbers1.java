class AddTwoNumbers {
    public ListNode reverse(ListNode head){
        if(head==null||head.next==null)
            return head;
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode r1=reverse(l1);
        ListNode r2=reverse(l2);
        ListNode head=new ListNode(-1);
        ListNode tail=head;
        int flag=0;
        while(r1!=null||r2!=null){
            int x=r1==null?0:r1.val;
            int y=r2==null?0:r2.val;
            int res=x+y+flag;
            ListNode node=new ListNode(res%10);
            flag=res/10;
            tail.next=node;
            tail=tail.next;
            if(r1!=null)
                r1=r1.next;
            if(r2!=null)
                r2=r2.next;
        }
        if(flag==1){
            tail.next=new ListNode(flag);
        }
        return reverse(head.next);
    }
}