public class DeleteDuplication {
    public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead==null){
            return pHead;
        }
        ListNode newHead=new ListNode(-1);
        newHead.next=pHead;
        ListNode pre=newHead;
        ListNode cur=pHead;
        ListNode curNext=cur.next;
        while(curNext!=null){
            if(cur.val==curNext.val){
                while(curNext!=null&&cur.val==curNext.val){
                    curNext=curNext.next;
                }
                pre.next=curNext;
                cur=curNext;
                if(curNext!=null)
                curNext=curNext.next;
            }else{
                cur=cur.next;
                pre=pre.next;
                curNext=curNext.next;
            }
        }
        return newHead.next;
    }
}