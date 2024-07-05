class Solution
{
    //Function to modify the matrix such that if a matrix cell matrix[i][j]
    //is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(int matrix[][])
    {
        // code here 
        int n=matrix.length;
        int m =matrix[0].length;
        boolean[] v1 =new boolean[n];
        boolean[] v2 = new boolean[m];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==1)
                {
                    v1[i]=true;
                    v2[j]=true;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(v1[i] || v2[j])
                {
                    matrix[i][j]=1;
                }
            }
        }
    }
}
