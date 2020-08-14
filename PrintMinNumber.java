import java.util.ArrayList;

public class PrintMinNumber{
    public String PrintMinNumber(int [] numbers) {
        if(numbers==null||numbers.length==0)
            return "";
        ArrayList<String> res=new ArrayList();
        func(res,numbers,0,numbers.length);
        Long min=Long.MAX_VALUE;
        for(String str:res){
            if(Long.parseLong(str)<min){
                min=Long.parseLong(str);
            }
        }
        return String.valueOf(min);
    }
    public void swap(int[]numbers,int x,int y){
        int temp=numbers[x];
        numbers[x]=numbers[y];
        numbers[y]=temp;
    }
    public void func(ArrayList<String> res,int[] numbers,int start,int len){
        if(start==len){
            StringBuffer sb=new StringBuffer();
            for(int i=0;i<len;i++){
                sb.append(numbers[i]);
            }
            res.add(sb.toString());
            return;
        }
        for(int i=start;i<len;i++){
            swap(numbers,i,start);
            func(res,numbers,start+1,len);
            swap(numbers,i,start);
        }
    }
}