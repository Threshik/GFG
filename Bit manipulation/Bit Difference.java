class Solution{
    
    // Function to find number of bits needed to be flipped to convert A to B
    public static int countBitsFlip(int a, int b){
        
        // Your code here
        int temp=a^b;
        int count=0;
        while(temp>0)
        {
            if(temp%2==1)
            count++;
            temp/=2;
        }
        return count;
        
    }
    
    
}
