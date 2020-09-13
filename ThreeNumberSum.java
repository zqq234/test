public class ThreeNumberSum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        while(sc.hasNextInt()){
            list.add(sc.nextInt());
        }
        int[] arr=new int[list.size()];
        int index=0;
        for(int x:list){
            arr[index++]=x;
        }
        
        int len=arr.length;
        if(len<3)
            return;
        Arrays.sort(arr);
        for(int i=0;i<len;i++){
            if(arr[i]>0){
                break;
            }
            if(i>0&&arr[i]==arr[i-1]){
                continue;
            }
            int j=i+1;
            int z=len-1;
            while(j<z){
                int sum=arr[i]+arr[j]+arr[z];
                if(sum<0){
                    j++;
                }else if(sum>0){
                    z--;
                }else if(sum==0){
                    ArrayList<Integer> temp=new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arr[z]);
                    res.add(temp);
                    while(z>j&&arr[j+1]==arr[j]){
                        j++;
                    }
                    while(z>j&&arr[z-1]==arr[z]){
                        z--;
                    }
                }

            }
        }
        for(ArrayList<Integer> temp:res){
            System.out.println(temp.get(0));
            for(int i=1;i<temp.size();i++){
                System.out.print(" "+temp.get(i));
            }
            System.out.println();
        }
    }
}
