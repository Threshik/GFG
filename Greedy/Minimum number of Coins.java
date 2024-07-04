class Solution{
    static List<Integer> minPartition(int N)
    {
        // code here
        List<Integer> res = new ArrayList<>();
        int coins[] = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
        int n = coins.length;
        for(int i=n-1;i>=0;i--)
        {
            while(N>=coins[i])
            {
            N=N-coins[i];
            res.add(coins[i]);
            if(N==0)
            break;
            }
        }
        return res;
        
    }
}
