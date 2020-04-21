import java.util.*;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        ListNode small=new ListNode(1);
        ListNode acur=small;
        ListNode large=new ListNode(1);
        ListNode bcur=large;
        ListNode cur=pHead;
        while(cur!=null){
            if(cur.val<x){
                acur.next=cur;
                acur=acur.next;
            }else{
                bcur.next=cur;
                bcur=bcur.next;
            }
            cur=cur.next;
        }
        acur.next=large.next;
        if(bcur.next!=null){
            bcur.next=null;
        }
        return small.next;
    }
}