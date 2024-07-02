class Solution {
    
    static int setBits(int N) {
        int count=0;
        // code here
        while(N>0)
        {
        // if(N%2==1)
        // count++;
        count=count+(N&1);
        N/=2;
        }
       
        return count;
    }
}
