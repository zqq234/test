class IsLongPressedName {
   public boolean isLongPressedName(String name, String typed) {
       int len1=name.length();
       int len2=typed.length();
        if (len2< len1) {
            return false;
        }
        int i = 0;
        int j = 0;
        while (i < len1 && j < len2) {
            char n = name.charAt(i);
            char t = typed.charAt(j);

            if (n != t) {
                return false;
            }
            
            int cn = 0;
            while (i < name.length() && name.charAt(i) == n) {
                i++;
                cn++;
            }
            
            int ct = 0;
            while (j < typed.length() && typed.charAt(j) == n) {
                j++;
                ct++;
            }
            
            if (ct < cn) {
                return false;
            }
        }
        
        if (i != name.length() || j != typed.length()) {
            return false;
        }
        
        return true;
    }

}