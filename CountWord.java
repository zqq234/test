public class CountWord{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int[]res=new int[26];
        for(char x:str.toCharArray()){
            res[x-'A']++;
        }
        int flag=1;
        for(int i=0;i<26;i++){
            if(flag==1&&res[i]!=0){
                System.out.print((char)(i+'A')+"="+res[i]);
                flag=0;
            }else if(flag==0&&res[i]!=0){
                System.out.print(" "+(char)(i+'A')+"="+res[i]);
            }
        }
    }
}
