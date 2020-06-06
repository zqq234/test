/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class CustomStack {
    int[] arr;
    int size;
    int top;
    public CustomStack(int maxSize) {
        arr=new int[maxSize];
        size=maxSize;
    }
    
    public void push(int x) {
        if(top==size){
            return;
        }
        arr[top++]=x;
    }
    
    public int pop() {
        if(top==0)
            return -1;
        return arr[--top];
    }
    
    public void increment(int k, int val) {
        if(k>size){
            k=size;
        }
        for(int i=0;i<k;i++){
            arr[i]+=val;
        }
    }
}