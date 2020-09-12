public class ShortStr{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        StringBuffer sb=new StringBuffer();
        int i=0;
        int len=str.length();
        while(i<len){
            int count=1;
            int j=i+1;
            while(j<len&&str.charAt(i)==str.charAt(j)){
                j++;
                count++;
            }
            if(count==1){
                sb.append(str.charAt(i));
            }else{
                sb.append(count);
                sb.append(str.charAt(i));
            }
            i=j;
        }
        System.out.println(sb.toString());
    }
}
