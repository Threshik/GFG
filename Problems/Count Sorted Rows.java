class Solution {
    int sortedCount(int N, int M, int Mat[][]) {
        // code here
        
        int count=0;
        for(int i=0;i<N;i++)
        {
            int inc=0;
            int dec=0;
          //traverse upto before last element
            for(int j=0;j<M-1;j++)
            {
              //strictly decreasing
                if(Mat[i][j]>Mat[i][j+1])
                dec++;
              //strictly increasing
                if(Mat[i][j]<Mat[i][j+1])
                inc++;
            }
        if(inc==M-1||dec==M-1)
        count++;
        }
        return count;
        
    }
};
