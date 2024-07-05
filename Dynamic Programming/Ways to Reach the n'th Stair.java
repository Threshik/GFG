class Solution
{
    //Function to count number of ways to reach the nth stair.
    int countWays(int n)
    {
        int[] dp=new int[n+1];
        if(n<=2)
        return n;
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++)
        {
            dp[i]=(dp[i-1]+dp[i-2])%1000000007;
        }
        return dp[n];
        
    }
}
// class Solution
// {
//     //Function to count number of ways to reach the nth stair.
//     int countWays(int n)
//     {
//         int[] dp=new int[n+1];
//         if(n==0||n==1)
//         return 1;
//         dp[0]=1;
//         dp[1]=1;
//         for(int i=2;i<=n;i++)
//         {
//             dp[i]=(dp[i-1]+dp[i-2])%1000000007;
//         }
//         return dp[n];
        
//     }
// }