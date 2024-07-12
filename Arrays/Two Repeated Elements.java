class Solution {
    // Function to find two repeated elements.
    public int[] twoRepeated(int n, int arr[]) {
        // Your code here
        int[] temp = new int[2];
        int j=0;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n+2;i++)
        {
            if(!set.contains(arr[i]))
            set.add(arr[i]);
            else
            temp[j++]=arr[i];
        }
        return temp;
    }
}
