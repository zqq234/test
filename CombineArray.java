import java.util.Arrays;

/**
 * @className CombineArray
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/12/1 18:01
 * @Version 1.0
 **/
public class CombineArray {
    public static int[] func(int[] arr1,int[] arr2){
        int len1=arr1.length;
        int len2=arr2.length;
        int[] res=new int[len1+len2];
        int flag=0;
        int flag1=0;
        int flag2=0;
        while(flag1<len1&&flag2<len2){
            if(arr1[flag1]<arr2[flag2]){
                res[flag++]=arr1[flag1++];
            }else{
                res[flag++]=arr2[flag2++];
            }
        }
        while(flag1<len1){
            res[flag++]=arr1[flag1++];
        }
        while(flag2<len2){
            res[flag++]=arr2[flag2++];
        }

        return res;
    }

    public static void main(String[] args) {
        int[]arr1={1,2,3,4};
        int[]arr2={3,5,6,7};
        System.out.println(Arrays.toString(func(arr1,arr2)));
    }
}
