class IntToRoman {
    public String intToRoman(int num) {
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"}; 
        int[] arab = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1}; 
        int index=0;
        StringBuffer sb=new StringBuffer();
        while(index<13){
            while(num>=arab[index]){
                sb.append(roman[index]);
                num-=arab[index];
            }
            index++;
        }
        return sb.toString();
    }
}