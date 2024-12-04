class Solution {
    public int myAtoi(String s) {
        long number = 0;
        boolean Negative = false;
        int i = 0, n = s.length();
        
        while(i < n && s.charAt(i) == ' '){
            i++;
        }
        
        while(i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')){
            Negative = (s.charAt(i) == '-');
            i++;
            if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
                return 0;  // Invalid sign combination, return 0
            }
        }
        
        while(i < n && Character.isDigit(s.charAt(i))){
            int ch = s.charAt(i) - '0';
            
            
            if(number > Integer.MAX_VALUE){
                return Negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            
            number = (number * 10) + ch;
            i++;
        }
       
        System.out.println(number);
        
        if(Negative)
            number = -number;
        
        if(number < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        if(number > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        
        return (int)number;
    }
}