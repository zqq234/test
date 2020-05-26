class RemoveDuplicateNodes {
    public ListNode removeDuplicateNodes(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        Set<Integer> set=new HashSet<>();
        set.add(head.val);
        ListNode cur=head;
        while(cur!=null&&cur.next!=null){
            int x=cur.next.val;
            if(set.contains(x)){
                cur.next=cur.next.next;
            }else{
                cur=cur.next;
                set.add(x);
            }
        }
        return head;
    }
}