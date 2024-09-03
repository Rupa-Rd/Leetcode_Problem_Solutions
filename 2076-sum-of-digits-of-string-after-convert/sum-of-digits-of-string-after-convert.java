class Solution {
    public int getLucky(String s, int k) {
        // Step 1: Convert the string to its numeric value sum
        int sum = 0;
        for (char c : s.toCharArray()) {
            int num = c - 'a' + 1;
            sum += sumOfDigits(num);
        }

        // Step 2: Perform the transformation k times
        while (k > 1) {
            sum = sumOfDigits(sum);
            k--;
        }

        return sum;
    }

    private int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
