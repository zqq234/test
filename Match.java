public class Match {
    public boolean match(char[] str, char[] pattern){  
        return judge(str,0,pattern,0);
    }
    public boolean judge(char[] str,int i, char[] pattern,int j){
        int m=str.length;
        int n=pattern.length;
        if(i==m&&j==n)return true;
        if(i<m&&j==n) return false;
        if(i==m&&j<n){
            if(j+1<n&&pattern[j+1]=='*'){
                return judge(str,i,pattern,j+2);
            }else return false;
        }
        char a=str[i],b=pattern[j],c='a';
        if(j+1<n){
           c=pattern[j+1];
        }
        if(c!='*'){
            if(a==b||b=='.'){
                return judge(str,i+1,pattern,j+1);
            }
            else return false;
        }
        else if(a==b||b=='.'){
            return judge(str,i,pattern,j+2)||judge(str,i+1,pattern,j);
        }return judge(str,i,pattern,j+2);
    }
}