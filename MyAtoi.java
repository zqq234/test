class MyAtoi {
    public int myAtoi(String str) {
       if(str==null) 
       return 0;
       int i=0;
       int len=str.length();
       int flag=1;
       long sum=0;
       while(i<len&&str.charAt(i)==' '){
           i++;
       }
       if(i<len&&str.charAt(i)=='-'){
           flag=-1;
           i++;
       }else if(i<len&&str.charAt(i)=='+'){
           i++;
       }
       while(i<len&&str.charAt(i)>='0'&&str.charAt(i)<='9'){
          sum=sum*10+str.charAt(i)-'0';
          i++;
          if(sum!=(int)sum) {
    			return (flag==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
    		}
       }
       return (int)(sum*flag);
    }
}