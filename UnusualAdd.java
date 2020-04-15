import java.util.*;

public class UnusualAdd {
    public int addAB(int A, int B) {
        // write code here
        while(A!=0){
            int temp=B;
            B=A^B;
            A=A&temp;
            A=A<<1;
        }
        return B;
    }
}