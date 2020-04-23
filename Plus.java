import java.util.*;
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Plus {
    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        ListNode res=new ListNode(1);
        ListNode cur=res;
        int flag=0;
        int sum=0;
        while(a!=null||b!=null){
            int x=(a==null)?0:a.val;
            int y=(b==null)?0:b.val;
            sum=x+y+flag;
            flag=sum/10;
            sum%=10;
            ListNode node=new ListNode(sum);
            cur.next=node;
            cur=cur.next;
            if(a!=null)
                a=a.next;
            if(b!=null)
                b=b.next;
        }
        if(flag==1){
            ListNode node=new ListNode(1);
            cur.next=node; 
        }
        return res.next;
    }
}