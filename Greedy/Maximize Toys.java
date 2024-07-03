class Solution{
    static int toyCount(int N, int K, int arr[])
    {
        // code here
        int sum=0;
        int count=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum<=K)
            count++;
            else
            break;
        }
        return count;
    }
}
