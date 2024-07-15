class Solution {
    // Function to find the number of islands.
    public void dfs(int row,int col,char[][] grid,int[] dx,int[] dy)
    {
        int n = grid.length;
        int m = grid[0].length;
        if(row<0 || row>=n || col<0 || col>=m || grid[row][col]!='1')
        return;
        
        grid[row][col]='0';
        for(int i=0;i<8;i++)
        {
            int n1=row+dx[i];
            int n2=col+dy[i];
            dfs(n1,n2,grid,dx,dy);
        }
    }
    public int numIslands(char[][] grid) {
        // Code here
        if(grid==null || grid.length==0)
        return 0;
        int n = grid.length;
        int m = grid[0].length;
        int[] dx = {0,0,1,-1,-1,-1,1,1};
        int[] dy = {1,-1,0,0,1,-1,1,-1};
        int numberofislands=0;
       
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1')
                {
                    numberofislands++;
                    dfs(i,j,grid,dx,dy);
                }
            }
        }
        return numberofislands;
        
    }
}
