class Solution
{
    //Function to find minimum time required to rot all oranges. 
    public int orangesRotting(int[][] grid)
    {
        // Code here
        Queue<int[]> q = new LinkedList<>();
        int count_fresh=0;
        int rows=grid.length;
        int col=grid[0].length;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[i][j]==2)
                {
                    q.add(new int[] {i,j});
                }
                if(grid[i][j]!=0)
                {
                    count_fresh++;
                }
            }
        }
        int countMin=0;
        int count=0;
        int[] dx = {0,0,1,-1};
        int[] dy = {1,-1,0,0};
        
        while(q.size()!=0)
        {
            int size = q.size();
            //processed oranges
            count+=size;
            
            for(int i=0;i<size;i++)
            {
                int[] point=q.remove();
                for(int j=0;j<4;j++)
                {
                    int x=point[0]+dx[j];
                    int y=point[1]+dy[j];
                    //check the boundary and whether is no orange or it is rotten
                    if(x<0||y<0||x>=rows||y>=col||grid[x][y]==2||grid[x][y]==0) 
                    continue;
                    
                    //make it as 2 and add them into the queue
                    grid[x][y]=2;
                    q.add(new int[] {x,y});
                    
                }
            }
            if(q.size()!=0)
            countMin++;
        }
        //if the count is equal the total no of good orange then return minutes or return -1
        return count==count_fresh?countMin:-1;
    }
}
