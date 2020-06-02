class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        int count=0;
        int len=lists.length;
        if(len==0)
            return null;
        ListNode head=new ListNode(-1);
        ListNode last=head;
        while(true){
            int min=Integer.MAX_VALUE;
            int flag=-1;
            for(int i=0;i<len;i++){
                if(lists[i]!=null&&lists[i].val<min){
                    min=lists[i].val;
                    flag=i;
                }
            }
            if(flag==-1)
                break;
            lists[flag]=lists[flag].next;
            last.next=new ListNode(min);
            last=last.next;
        }  
        return head.next;
    }
}