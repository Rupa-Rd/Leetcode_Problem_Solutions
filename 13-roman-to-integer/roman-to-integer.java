class Solution {
    public int romanToInt(String s) {
        s = s.replace("IV", "IIII").replace("IX", "VIIII").replace("XL","XXXX").replace("XC","LXXXX").replace("CD", "CCCC").replace("CM", "DCCCC");
        
        int ans = 0;
        
        for(char c: s.toCharArray()){
            if(c == 'I')    
                ans += 1;
            else if(c == 'V')
                ans += 5;
            else if(c == 'X')
                ans += 10;
            else if(c == 'L')
                ans += 50;
            else if(c == 'C')
                ans += 100;
            else if(c == 'D')
                ans += 500;
            else
                ans += 1000;
        }
        System.out.println(ans);
        
        return ans;
    }
}