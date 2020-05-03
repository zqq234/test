package LinkList;

public class MyLinkList {
    public static class Node{
        public int val;
        public Node next;
        public Node(int val){
            this.val=val;
        }
    }
    public Node head;
    public int size;
    //头插法
    public void addFirst(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
        }else{
            node.next=head;
            head=node;
        }
        size++;
    }
    //尾插法
    public void addLast(int val){
        Node node=new Node(val);
        Node cur=head;
        if(cur==null){
            head=node;
        }else{
            while(cur.next!=null){
                cur=cur.next;
            }
            cur.next=node;
        }
        size++;
    }
    //方法一：删除倒数第k个节点
    public void deleteK(int k){
        Node fast=head;
        while(k--!=0){
            if(fast==null){
                return;
            }
            fast=fast.next;
        }
        if(fast==null){
            head=head.next;
        }else{
            Node slow=head;
            while(fast.next!=null){
                fast=fast.next;
                slow=slow.next;
            }
            slow.next=slow.next.next;
        }
        size--;
    }
    //方法二，删除倒数第K个节点
    public void deleteK2(int k){
        Node fast=head;
        while(fast!=null){
            fast=fast.next;
            k--;
        }
        if(k==0){
            head=head.next;
        }else if(k>0){
            return;
        }else{
            Node slow=head;
            while(++k!=0){
                slow=slow.next;
            }
            slow.next=slow.next.next;
        }
    }
    //删除第k个节点
    public void delete(int k){
        if(k<=0||k>size){
            return;
        }
        if(k==1){
            head=head.next;
        }else{
            Node cur=head;
            while(--k!=0){
                cur=cur.next;
            }
            cur.next=cur.next.next;
        }
        size--;
    }
    //查找下标为index的值
    public int get(int index){
        if(index>=size||index<0){
            return -1;
        }
        Node cur=head;
        while(index!=0){
            index--;
            cur=cur.next;
        }
        return cur.val;
    }
    //在index位置添加元素
    public void addAtIndex(int index,int val){
        if(index>size||index<0){
            return;
        }
        Node cur=head;
        Node node=new Node(val);
        if(index==0){
            node.next=head;
            head=node;
        }else{
            while(--index!=0){
                cur=cur.next;
            }
            node.next=cur.next;
            cur.next=node;
        }
        size++;
    }
    //删除index位置的节点
    public void deleteIndex(int index){
        if(index>=0&&index<size){
            if(index==0){
                head=head.next;
            }else{
                Node cur=head;
                while(--index!=0){
                    cur=cur.next;
                }
                cur.next=cur.next.next;
            }
            size--;
        }
    }
    public void print(){
        Node cur=head;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
    }
    public int lenght(){
        return this.size;
    }
}
