class Solution {
    public long nthStair(int n) {
        // Code here
        long[] dp = new long[n+1];
        if(n<=2)
        return (long)n;
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++)
        dp[i]=1+Math.min(dp[i-1],dp[i-2]);
        return dp[n];
        
        //return (long)n/2+1;
    }
}
