import java.util.*;
public class Money{
    public static String func(String str){
        StringBuffer res=new StringBuffer();
        char[] a=new char[]{'零','壹','贰','叁','肆','伍','陆','柒','捌','玖'};
        char[] b=new char[]{'元','拾','佰','仟','万','拾','佰','仟','亿','拾','佰','仟','万'};
        int len=str.length();
        boolean flag=true;
        int ans=0;
        for(int i=len-1;i>=0;i--){
            char x=str.charAt(i);
            if(flag&&x=='0'){
                if(ans%4==0)
                    res.append(b[ans++]);
                else
                    ans++;
                continue;
            }else{
                flag=false;
                if(x=='0'){
                    if(str.charAt(i+1)!='0'){
                        res.append(a[0]);
                        ans++;
                    }else
                        ans++;
                }else{
                    if(ans%4==1&&x=='1'&&i==0){
                        res.append(b[ans++]);
                    }else{
                        res.append(b[ans++]);
                        res.append(a[x-'0']);
                    }
                }
                if(ans%4==0){
                    flag=true;
                }
            }
        }
        return res.reverse().toString();
    }
    public static String decimal(String str){
        char[] a=new char[]{'零','壹','贰','叁','肆','伍','陆','柒','捌','玖'};
        char[] b=new char[]{'角','分'};
        int len=str.length();
        StringBuffer res=new StringBuffer();
        for(int i=0;i<2;i++){
            char x=str.charAt(i);
            res.append(a[x-'0']);
            res.append(b[i]);
        }
        if(res.toString().equals("零角零分")){
            return "整";
        }else{
            return res.toString();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String num=sc.nextLine();
        String[] str=num.split("\\.");
        StringBuffer sb=new StringBuffer("人民币");
        sb.append(func(str[0]));
        sb.append(decimal(str[1]));
        System.out.println(sb.toString());
    }
}