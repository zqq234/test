/**
 * @className BubbleSort
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/4/10 19:57
 * @Version 1.0
 **/
public class BubbleSort {
    public static void sort(int[] array){
        boolean isCharge=false;
        for(int i=0;i<array.length;i++){
            isCharge=false;
            for(int j=1;j<array.length-i;++j){
                if(array[j-1]>array[j]){
                    int temp=array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;
                    isCharge=true;
                }
            }
            if(!isCharge){
                return;
            }
        }
    }
}
