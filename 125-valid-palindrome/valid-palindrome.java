class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        System.out.println(s);
        boolean flag = true;
        for(int i = 0; i < s.length() / 2; i ++){
            if(s.charAt(i) != s.charAt((s.length() - 1) - i)){
                flag = false;
                break;
            }
        }
        return flag;
    }
}