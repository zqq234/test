/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class FindFirstCommonNode{
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
         int alen=0;
        int blen=0;
        ListNode acur=pHead1;
        ListNode bcur=pHead2;
        while(acur!=null){
            alen++;
            acur=acur.next;
        }
        while(bcur!=null){
            blen++;
            bcur=bcur.next;
        }
        acur=pHead1;
        bcur=pHead2;
        int len=alen-blen;
        if(len>0){
            while(len>0){
                acur=acur.next;
                len--;
            }
        }else{
            len=-len;
            while(len>0){
                acur=acur.next;
                len--;
            }
        }
        while(acur!=null&&bcur!=null){
            if(acur==bcur){
                return acur;
            }
            acur=acur.next;
            bcur=bcur.next;
        }
        return null;
    }
}