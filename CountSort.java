/**
 * @className CountSort
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/4/10 20:01
 * @Version 1.0
 **/
public class CountSort {
    public static void sort(int[]array){
        int min=array[0];
        int max=array[0];
        for (int i = 0; i <array.length ; i++) {
            if(array[i]>max){
                max=array[i];
            }
            if(array[i]<min){
                min=array[i];
            }
        }
        int range=max-min+1;
        int[] arrayCount=new int[range];

        for (int i = 0; i <array.length ; i++) {
            arrayCount[array[i]-min]++;
        }
        int index=0;
        for (int i = 0; i <range ; i++) {
            while(arrayCount[i]!=0){
                array[index++]=i+min;
                arrayCount[i]--;
            }
        }
    }
}
