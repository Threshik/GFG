class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        String[] str = S.split("\\.");
        String res="";
        
        for(int i=str.length-1;i>=0;i--)
        {
            res+=str[i];
            if(i!=0)
            res+=".";
        }
        return res;
    }
}
