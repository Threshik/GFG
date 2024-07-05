class Solution {
    int minRow(int n, int m, int a[][]) {
        // code here
        int min=Integer.MAX_VALUE;
        int index=0;
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<m;j++)
            {
                if(a[i][j]==1)
                c++;
            }
            if(c<min)
            {
            min=c;
            index=i+1;
            }
        }
        
        return index;
    }
};
