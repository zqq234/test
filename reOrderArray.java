public class reOrderArray{
    public void reOrderArray(int [] array) {
        int len=array.length;
        int[] arr=new int[len];
        int flag=0;
        for(int i=0;i<len;i++){
            if(array[i]%2==1){
                arr[flag++]=array[i];
            }
        }
        for(int i=0;i<len;i++){
            if(array[i]%2==0){
                arr[flag++]=array[i];
            }
        }
        System.arraycopy(arr,0,array,0,len);
    }
}