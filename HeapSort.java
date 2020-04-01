public class HeapSort {
    public static void sort(int[] arr){
        int end=arr.length-1;
        int lastLeaf=(end-1)>>1;
        for(int i=lastLeaf;i>=0;i--){
            shiftDown(arr,i,end+1);
        }

        while(end>=0){
            int tmp=arr[end];
            arr[end]=arr[0];
            arr[0]=tmp;
            shiftDown(arr,0,end);
            end--;
        }
    }
    public static void shiftDown(int[] arr,int parent,int size){
        int child=parent*2+1;
        while(child<size){
            if((child+1)<size&&arr[child+1]>arr[child]){
                child=child+1;
            }
            if(arr[child]>arr[parent]){
                int tmp=arr[parent];
                arr[parent]=arr[child];
                arr[child]=tmp;
                parent=child;
                child=parent*2+1;
            }else{
                break;
            }

        }
    }
    public static void main(String[] args) {
        int[] arr={6,4,8,2,0,7,1,3};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
