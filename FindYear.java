public class FindYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuffer sb=new StringBuffer();
        sb.append(sc.nextLine());
        List<String> list=new ArrayList<>();
        for(int i=0;i<sb.length();i++){
            char x=sb.charAt(i);
            if (x > '9' || x < '0') {
                sb.setCharAt(i,' ');
            }
        }
        String[] res=sb.toString().split(" ");
        boolean flag=true;
        for (String str:res) {
            if(str.equals(""))
                continue;
            int x=Integer.parseInt(str);
            if(flag&&x>=1000&&x<=3999){
                System.out.print(x);
                flag=false;
            }else if(x>=1000&&x<=3999){
                System.out.print(" "+x);
            }
        }
    }
}