import java.util.*;
public class IPConvert{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String str=sc.nextLine();
            String[] arr=str.split("\\.");
            if(arr.length==1){
                StringBuffer sb=new StringBuffer();
                long ip=Long.parseLong(arr[0]);
                sb.append(ip>>>24);
                sb.append(".");
                sb.append((ip&0x00ffffff)>>>16);
                sb.append(".");
                sb.append((ip&0x0000ffff)>>>8);
                sb.append(".");
                sb.append((ip&0x00ff));
                System.out.println(sb.toString());
            }else{
                Long ip=(Long.parseLong(arr[0])<<24)+(Long.parseLong(arr[1])<<16)+(Long.parseLong(arr[2])<<8)+Long.parseLong(arr[3]);
                System.out.println(ip);
            }
        }
    }
}