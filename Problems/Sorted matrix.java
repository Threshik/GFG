class Solution {
    int[][] sortedMatrix(int N, int Mat[][]) {
        // code here
        //ArrayList<Integer> list = new ArrayList<>();
        int k=0;
        int[] arr=new int[N*N];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                arr[k++]=Mat[i][j];
            }
        }
        Arrays.sort(arr);
        k=0;
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                Mat[i][j]=arr[k++];
            }
            
        }
        return Mat;
    }
};
