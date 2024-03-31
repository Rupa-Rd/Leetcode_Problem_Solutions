class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sumOfDigits = 0;
        int original = x;
        while (x != 0){
            int rem = x % 10;
            sumOfDigits += rem;
            x = x / 10;
        }
        // System.out.print(sumOfDigits);
        return original % sumOfDigits == 0? sumOfDigits : -1;
    }
}