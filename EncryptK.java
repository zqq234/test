import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class EncryptK 
{
	public static void main(String args[] )
	{
		// Write your code here
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int n=sc.nextInt();
		StringBuffer sb=new StringBuffer();
		int len=str.length();
		if(n>len){
		    n%=len;
		}
		for(int i=0;i<len;i++){
		    if(i+n<len){
		        sb.append(str.charAt(i+n));
		    }else{
		        sb.append(str.charAt(n-len+i));
		    }
		}
		System.out.println(sb.toString());
	}
}