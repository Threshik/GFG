class GFG
{
    static void rotate(int matrix[][]) 
    {
        // Code Here
        //Approach: find transpose and reverse row wise
        
        int n = matrix.length;
        
        //transpose of the matrix
        
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        // reverse row wise int the matrix
        
        for(int i=0;i<n;i++)
        {
          int s=0;
          int e=n-1;
          while(s<e)
          {
              int tem = matrix[s][i];
              matrix[s][i]=matrix[e][i];
              matrix[e][i]=tem;
              s++;
              e--;
          }
        }
       
        // int n=matrix.length;
        // for(int i=0;i<n/2;i++)
        // {
        //     for(int j=i;j<n-i-1;j++)
        //     {
        //         int temp=matrix[i][j];
        //         matrix[i][j]=matrix[j][n-1-i];
        //         matrix[j][n-1-i]=matrix[n-1-i][n-1-j];
        //         matrix[n-1-i][n-1-j]=matrix[n-1-j][i];
        //         matrix[n-1-j][i]=temp;
        //     }
        // }
    }
}
