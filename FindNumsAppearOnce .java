public class FindNumsAppearOnce {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int ret=0;
        for(int x:array){
            ret^=x;
        }
        ret&=(-ret);
        for(int x:array){
            if((x&ret)==0){
                num1[0]^=x;
            }else{
                num2[0]^=x;
            }
        }
    }
}