import java.util.ArrayList;
public class FindContinuousSequence {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        for(int i=1;i<=sum/2;i++){
           int flag=i;
            ArrayList<Integer> temp=new ArrayList<>();
            temp.add(i);
            for(int j=i+1;;j++){
                temp.add(j);
                flag+=j;
                if(flag==sum){
                    res.add(temp);
                    break;
                }else if(flag>sum){
                    break;
                }
                
            }
       }
        return res;
    }
}