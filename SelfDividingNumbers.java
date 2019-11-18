public class SelfDividingNumbers {
    public  static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList();
        for(int i=left;i<=right;i++){
            int num=i;
            while(num>0){
                if(num%10==0||i%(num%10)>0){
                    break;
                }
                num/=10;
            }
            if(num==0){
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        List<Integer> list=selfDividingNumbers(1, 22);
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i)+" ");
        }
    }
}