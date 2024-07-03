class Solution {
    int isPanagram(String S) {
        // code here
        String a = S.toLowerCase();
        char[] ch = a.toCharArray();
        Set<Character> set = new LinkedHashSet();
        
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]>='a' && ch[i]<='z')
            set.add(ch[i]);
        }
        if(set.size()==26)
        return 1;
        else
        return 0;
        
    }
}
