/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class FindFirstCommonNode1{
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1==null||pHead2==null){
            return null;
        }
        ListNode acur=pHead1;
        ListNode bcur=pHead2;
        while(acur!=bcur){
            acur=acur.next;
            bcur=bcur.next;
            if(acur!=bcur){
                if(acur==null){
                    acur=pHead2;
                }
                if(bcur==null){
                    bcur=pHead1;
                }
            }
        }
        return acur;
    }
}