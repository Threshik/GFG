class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        
        //Code here
        Node th = head;
        if(head==null)
        return 0;
        int count=0;
        while(th!=null)
        {
            count++;
            th=th.next;
        }
        return count;
    }
}
