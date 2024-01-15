class Solution {
    public int mySqrt(int x) {
        // Sqrt formula : sqrt(num) = (sqrt(N) + num /swrt(N)) / 2.0
        // where sqrt(N) = num / 2.0
        double sqrt;
        double sqrtn = x / 2.0;
        if (x==0){
            return 0;
        }
        do{
            sqrt = sqrtn;
            sqrtn = (double)(sqrt + (double)(x / sqrt)) / 2.0;

        }while((sqrt - sqrtn) != 0);
        return (int)Math.floor(sqrt);
    }
}