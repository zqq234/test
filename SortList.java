class SortList {
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode slow=head;
        ListNode tmp=null;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            tmp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(tmp!=null){
            tmp.next=null;
        }
        ListNode left=sortList(head);
        ListNode right=sortList(slow);
        ListNode res=new ListNode(-1);
        ListNode last=res;
        while(left!=null&&right!=null){
            if(left.val<right.val){
                last.next=left;
                left=left.next;
            }else{
                last.next=right;
                right=right.next;
            }
            last=last.next;
        }
        last.next=left==null?right:left;
        return res.next;
    }
}