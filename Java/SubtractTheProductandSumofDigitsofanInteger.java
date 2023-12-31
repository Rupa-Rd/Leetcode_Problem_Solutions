//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/

public class SubtractTheProductandSumofDigitsofanInteger {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }

    static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n > 0) {
            int lastdigit = n % 10;

            product = product * lastdigit;
            sum = sum + lastdigit;
            n = n / 10;
        }
        return product - sum;
    }
}
