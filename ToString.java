/**
 * @className ToString
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/10/26 20:49
 * @Version 1.0
 **/
public class ToString {
    public static String toString(int[] array){
        String str;
        int s=0;
        str="[";
        for (int i = 0; i <array.length ; i++) {
            str+=array[i];
            if(i!=array.length-1){
                str=str+",";
            }
        }
        str+="]";
        return str;
    }

    public static void main(String[] args) {
        int[] array={1,3,4,5,6};
        String str=toString(array);
        System.out.println(str);
    }
}
