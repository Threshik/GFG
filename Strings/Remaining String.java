class Solution {
    public String printString(String s, char ch, int count) {
        // code here
        int c=0;
        int index=-1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==ch)
            {
            c++;
            }
            if(c==count)
            {
                index=i;
                break;
            }
        }
        if(index!=-1)
        return s.substring(index+1,s.length());
        return "";
    }
}
