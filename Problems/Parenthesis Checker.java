class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        int len = x.length();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<len;i++)
        {
            char ch = x.charAt(i);
            if(ch=='{'||ch=='['||ch=='(')
            {
                st.push(ch);
            }
            else
            {
                if(st.isEmpty())
                return false;
                else if((ch=='}' && st.peek()=='{') || (ch==')' && st.peek()=='(')|| (ch==']' && st.peek()=='['))
                {
                    st.pop();
                }
                else
                return false;
            }
        }
        if(st.isEmpty())
        return true;
        else
        return false;
    }
}
