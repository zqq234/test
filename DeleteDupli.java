public class DeleteDupli {
    public static void main(String[] args) {
        int[] arr={1,1,1,0,0,2,2,2,2};
        int res=1;
        for(int i=1;i<arr.length;i++){
            int flag=0;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    flag=1;
                }
            }
            if(flag==0&&res!=i){
                arr[res++]=arr[i];
            }
        }
        System.out.println(res);
        System.out.println(Arrays.toString(arr));
    }
}