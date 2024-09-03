class Solution {
    public int getLucky(String s, int k) {
        StringBuilder digit = new StringBuilder();

        for (char c : s.toCharArray()) {
            int d = (c - 'a') + 1;  
            digit.append(d);
        }

        long ans = 0;
        String digitStr = digit.toString();
        for (int i = 0; i < k; i++) {
            ans = sumOfDigits(digitStr);
            digitStr = String.valueOf(ans);
        }

        return (int) ans;
    }

    public long sumOfDigits(String numStr) {
        long sum = 0;
        for (char c : numStr.toCharArray()) {
            sum += (c - '0');  
        }
        return sum;
    }
}
