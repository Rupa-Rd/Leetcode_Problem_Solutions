class Solution {
    public String findLatestTime(String s) {
        // String u = "11";
        // String t = "2";
        // StringBuilder str = new StringBuilder(s);
        // if(s.substring(0,5) == '?'){return "11:59";}
        if(s.charAt(0) == '?' && s.charAt(1)=='?'){
            s = "1" + "1" + s.substring(2,5);
        }else if(s.charAt(0) == '0' && s.charAt(1) == '?'){
            s = s.substring(0,1) + "9"+s.substring(2,5);
        }else if(s.charAt(0) == '?' && s.charAt(1) == '0'){
            s = "1"+s.substring(1,5);
        }else if(s.charAt(0) == '?' && s.charAt(1) == '1'){
            s = "1"+s.substring(1,5);
        }
        else if(s.charAt(1) == '?'){
            s = s.substring(0,1) + "1"+s.substring(2,5);
        }else if (s.charAt(0) == '?'){
            s = "0"+s.substring(1,5);
        }
        if(s.charAt(3) == '?') {
        s = s.substring(0, 3) + "5" + s.substring(4,5);
        }
        if(s.charAt(4) == '?') {
        s = s.substring(0, 4) + "9";
        }
        // System.out.print(s.substring(4,5));
        return s;
    }
}