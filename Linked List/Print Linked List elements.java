class Solution
{
    // Print elements of a linked list on console
    // head pointer input could be NULL as well
    // for empty list
    void display(Node head)
    {
        //add code here.
        Node th = head;
        if(head==null)
        System.out.print(" ");
        while(th!=null)
        {
            System.out.print(th.data+" ");
            th=th.next;
        }
    }
}
