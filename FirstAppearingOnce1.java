import java.util.*;
public class FirstAppearingOnce {
    //Insert one char from stringstream
    HashMap<Character,Integer> map=new HashMap<>();
    Queue<Character> q=new LinkedList<>();
    public void Insert(char ch)
    {
        map.put(ch,map.getOrDefault(ch,0)+1);
        q.offer(ch);
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        int len=q.size();
        boolean flag=true;
        char res='#';
        for(int i=0;i<len;i++){
            char ch=q.poll();
            if(map.get(ch)==1&&flag){
                res=ch;
                flag=false;
            }
            q.offer(ch);
        }
        return res;
    }
}