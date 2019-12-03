
public class ZipStr {
    public static String func(String str){
        StringBuffer sb=new StringBuffer();
        int count=1;
        for (int i = 0; i < str.length(); i++) {
            if((i < str.length()-1)&&str.charAt(i)==str.charAt(i+1)){
                count++;
            }else{
                sb.append(count);
                sb.append(str.charAt(i));
                count=1;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="aaabbccccd";
        String str1=func(str);
        System.out.println(str1);
    }
}
