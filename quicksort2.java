public static void quicksort(int[] array){
        Stack<Integer> s=new Stack<>();
        s.push(array.length-1);
        s.push(0);
        while(!s.isEmpty()){
            int left=s.pop();
            int right=s.pop();
            if(right-left>0){
                int div=partion2(array,left,right);
                s.push(right);
                s.push(div+1);
                s.push(div-1);
                s.push(left);
            }
        }
    }
 public static int partion2(int[] arr,int left,int right){
        int cur=left;
        int prev=cur-1；
        int key=arr[right];
        while(cur<right){
            if(arr[cur]<key&&++prev!=cur){
                exchange(arr,prev,cur);
            }
            ++cur;
        }
        if(++prev!=right){
            exchange(arr,prev,right);
        }
        return prev;
    }