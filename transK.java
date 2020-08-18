public String transK(String str,int x,int y){
	char[] arr=new char[36];
	for(int i=0;i<10;i++){
		arr[i]=(char)('0'+i);
	}
	for(int i=10;i<36;i++){
		arr[i]=(char)('A'+i-10);
	}
	int number=Integer.valueOf(str,x);
	StringBuffer sb=new StringBuffer();
	while(number!=0){
		sb.append(arr[number%y]);
		number/=y;
	}
	return sb.reverse().toString();
}