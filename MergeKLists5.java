class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        Queue<ListNode> q=new PriorityQueue<>((l1,l2)->l1.val-l2.val);
        for(ListNode cur:lists){
            if(cur!=null){
                q.offer(cur);
            }
        }
        ListNode head=new ListNode(-1);
        ListNode tmp=head;
        while(!q.isEmpty()){
            ListNode node=q.poll();
            tmp.next=node;
            if(node.next!=null){
                q.offer(node.next);
            }
            tmp=tmp.next;
        }
    return head.next;
    }
}