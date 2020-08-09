/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.ArrayList;
import java.util.*;
public class PrintListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res=new ArrayList<Integer>();
        Stack<Integer> s=new Stack<>();
        ListNode cur=listNode;
        while(cur!=null){
            s.push(cur.val);
            cur=cur.next;
        }
        while(!s.isEmpty()){
            res.add(s.pop());
        }
        return res;
    }
}