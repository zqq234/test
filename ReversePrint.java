class ReversePrint {
    public int[] reversePrint(ListNode head) {
        if(head==null){
            return new int[0];
        }
        Stack<ListNode> s=new Stack();
        while(head!=null){
            s.push(head);
            head=head.next;
        }
        int[] arr=new int[s.size()];
        int flag=0;
        while(!s.isEmpty()){
            arr[flag++]=s.pop().val;
        }
        return arr;
    }

}



