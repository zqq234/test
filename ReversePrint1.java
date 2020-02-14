/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class ReversePrint1 {
    public int[] reversePrint(ListNode head) {
        if(head==null){
            return new int[0];
        }
        List<Integer> list=new LinkedList();
        reverse(head,list);
        int[] arr=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
    public void reverse(ListNode head,List list){
        if(head.next!=null){
            reverse(head.next,list);
        }
        list.add(head.val);
    }
}


