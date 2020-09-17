import java.util.*;
public class SecondlyWord {
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        HashMap<String,Integer> res=new HashMap<>();
        char[]arr=str.toCharArray();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<str.length();i++){
            char x=str.charAt(i);
            if(x<='z'&&x>='a'||x<='Z'&&x>='A'){
                sb.append(x);
            }else if(i>0&&str.charAt(i-1)!=' '&&x==' '){
                sb.append(" ");
            }
        }
        String ss=sb.toString();
        String[] strings=ss.split(" ");
        System.out.println(Arrays.toString(strings));
        for(int i=0;i<strings.length;i++){
            if(strings[i]==""||strings[i]==null){
                continue;
            }
            res.put(strings[i],res.getOrDefault(strings[i],0)+1);
        }
        System.out.println(res);
        int a=0;
        String aa="";
        int b=0;
        String bb="";
        for (Map.Entry<String,Integer> e:res.entrySet()) {
            if(e.getValue()>a){
                b=a;
                a=e.getValue();
                bb=aa;
                aa=e.getKey();
            }else if(e.getValue()>b){
                b=e.getValue();
                bb=e.getKey();
            }
        }
        System.out.println(bb);
    }
}