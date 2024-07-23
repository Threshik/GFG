class Solution
{
    //Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int matrix[][], int n) 
    { 
        // code here
        //approach: reverse row wise the matrix then take the transposereturn;
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++)
        {
            int s=0,e=n-1;
            while(s<=e)
            {
              int temp=matrix[i][s];
              matrix[i][s]=matrix[i][e];
              matrix[i][e]=temp;
              s++;
              e--;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        return;
       
        
    }
}
