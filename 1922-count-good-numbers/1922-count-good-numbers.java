class Solution {
    static final long MOD = 1000000007;

    private long power(long x, long n) {
        long result = 1;
        
        while (n > 0) {
            if ((n & 1) == 1)
                result = (result * x) % MOD;
            
            x = (x * x) % MOD;
            n = n >> 1;
        }
        
        return result;
    }

    public int countGoodNumbers(long n) {
        long evenPositions = (n + 1) / 2;
        long oddPositions = n / 2;

        long evenPart = power(5, evenPositions);
        long oddPart = power(4, oddPositions);

        return (int)((evenPart * oddPart) % MOD);
    }
}
