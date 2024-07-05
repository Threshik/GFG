class Solution
{
    //Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][])
    {
        // code here 
        int n = matrix.length;
        int m = matrix[0].length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            //even row by left to right
            if(i%2==0)
            {
                for(int j=0;j<n;j++)
                {
                    list.add(matrix[i][j]);
                }
            }
            //odd row by right to left
            else
            {
                for(int k=n-1;k>=0;k--)
                {
                    list.add(matrix[i][k]);
                }
            }
        }
        return list;
    }
}
