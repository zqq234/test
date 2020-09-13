public class LongSubStr{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        while(sc.hasNextInt()){
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        System.out.println(list.get(list.size()/2));
    }
}
