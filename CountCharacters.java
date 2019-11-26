class CountCharacters {
    
	public int countCharacters(String[] words, String chars) {
        
		char[] target = chars.toCharArray();
        
		int[] temp = new int[26];
        
		int result = 0;
        
		for (char c : target) {
            
			temp[c - 'a']++;
        
		}
        
		for (String word : words) {
            
			char[] src = word.toCharArray();
            
			int one = 0;
            
			int[] t = temp.clone();
            
			for (char c : src) {
                
				if(t[c - 'a']-- > 0){
                    
					one++;
                
				}
            
			}
            
			if (one == word.length()){
                
				result += one;
            
			}
        
		}
        
		return result;
    
	}

}
