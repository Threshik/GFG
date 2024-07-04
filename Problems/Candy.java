class Solution {
    static int minCandy(int N, int ratings[]) {
        // code here
        int n = ratings.length;
        int[] a1= new int[n];
        int[] a2 = new int[n];
        int left=0;
        int right=n-1;
        for(int i=0;i<n;i++)
        {
            a1[i]=1;
            a2[i]=1;
        }
        for(int i=1;i<n;i++)
        {
            if(ratings[i-1]<ratings[i])
            {
                a1[i]=a1[i]+a1[i-1];
            }
        }
        for(int i=n-2;i>=0;i--)
        {
            if(ratings[i+1]<ratings[i])
            {
                a2[i]=a2[i]+a2[i+1];
            }
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=Math.max(a1[i],a2[i]);
        }
        return sum;
        
        
    }
}
