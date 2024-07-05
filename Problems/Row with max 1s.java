class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int max=0;
        int index=-1;
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]==1)
                c++;
            }
            if(c>max)
            {
                max=c;
                index=i;
            }
        }
        return index;
    }
}
