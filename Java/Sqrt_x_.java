//https://leetcode.com/problems/sqrtx/description/
public class Sqrt_x_ {
    public static void main(String[] args) {
        int x = 8;
        double sqrt;
        double sqrtn = x / 2.0;
        if (x == 0) {
            System.out.println("0");
        }
        do {
            sqrt = sqrtn;
            sqrtn = (double) (sqrt + (double) (x / sqrt)) / 2.0;

        } while ((sqrt - sqrtn) != 0);
        System.out.println((int) Math.floor(sqrt));
    }
}
