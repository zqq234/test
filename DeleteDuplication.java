class ListNode{
    public int data;
    public ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next=null;
    }
}
public class DeleteDuplication{
    public ListNode deleteDuplication(){
        ListNode node=new ListNode(-1);
        ListNode cur=this.head;
        ListNode tmp=node;
        while(cur!=null){
            if(cur.next!=null&&cur.data==cur.next.data){
                //1、循环
                //2、退出循环 cur要多走一步
               while(cur.next!=null&&cur.data==cur.next.data){
                   cur=cur.next;
               }
               cur=cur.next;
            }else{
                tmp.next=cur;
                cur=cur.next;
                tmp=tmp.next;
            }
        }
        tmp.next=null;
        return node.next;
    }
    public boolean chkPalindrome(){
        if(head==null){
            return false;
        }
        if(head.next==null){
            return true;
        }
        ListNode fast = this.head;
        ListNode slow = this.head;

        while (fast != null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //反转
        ListNode p = slow.next;
        while (p != null) {
            ListNode pNext = p.next;
            p.next=slow;
            slow=p;
            p=pNext;
        }
        while(slow!=this.head){
            if(slow.data!=head.data){
                return false;
            }
            if(this.head.next==slow){
                return true;
            }

            slow=slow.next;
            head=head.next;
        }
        return true;

        //slow往前    head 往后  .data不一样 返回false
        //直到相遇

    }
}