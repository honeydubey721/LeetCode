class Solution {
    public int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);

        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;

        long ans = 0;

        while (n >= d) {

            long temp = d;
            long count = 1;

            while (n >= temp) {
                n -= temp;
                ans += count;
                temp <<= 1;
                count <<= 1;
            }
        }

        return (int) (sign * ans);
    }
}