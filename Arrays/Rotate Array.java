class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void reverse(int[] arr, int left,int right)
    {
        while(left<=right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    static void rotateArr(int arr[], int d, int n) {
        // add your code here
        d%=n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
}
