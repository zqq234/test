class ReverseWords {
    public String reverseWords(String s) {
        String[] str=s.split(" ");
        StringBuffer sb=new StringBuffer();
        for(String word:str){
            sb.append(new StringBuffer(word).reverse().toString()+" ");
        }
        return sb.toString().trim();
    }
}