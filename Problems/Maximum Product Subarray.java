class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        long maxprod=Integer.MIN_VALUE;
        long prod=1;
        for(int i=0;i<n;i++)
        {
            prod*=arr[i];
            if(prod>maxprod)
            {
                maxprod=prod;
            }
            if(prod==0)
            prod=1;
        }
        prod=1;
        for(int i=n-1;i>=0;i--)
        {
            prod*=arr[i];
            if(prod>maxprod)
            {
                maxprod=prod;
            }
            if(prod==0)
            prod=1;
        }
        return maxprod;
    }
}
