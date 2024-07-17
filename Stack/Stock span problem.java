class Solution {
    // Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n) {
        // Your code here
        int[] span = new int[n];
        Stack<Integer> st = new Stack<>();
        span[0]=1;
        st.push(0);
        
        for(int i=1;i<n;i++)
        {
            while(!st.isEmpty() && price[st.peek()]<= price[i])
            st.pop();
            
            if(st.isEmpty())
            span[i]=i+1;
            else
            span[i]=i-st.peek();
            
            st.push(i);
        }
        return span;
    }
}
