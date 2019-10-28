/**
 * @className BinarySearch
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/10/26 20:50
 * @Version 1.0
 **/
public class BinarySearch {
    public static int binarySearch(int[] array,int key,int left,int right){
        int mid=(left+right)/2;
        if(left<=right){
            if(array[mid]>key){
                return binarySearch(array,key,left,mid-1);
            } else if(array[mid]==key){
                return mid;
            }
            else{
                return binarySearch(array,key,mid+1,right);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array={1,2,4,8,3,5};
        System.out.println(binarySearch(array,4,0,5));
    }
}
