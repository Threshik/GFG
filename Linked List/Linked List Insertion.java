class Solution
{
    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x)
    {
        // code here
        if(head==null)
        {
        head=new Node(x);
        return head;
        }
        Node temp = new Node(x);
        temp.next=head;
        head=temp;
        
        return head;
    }
    
    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
        // code here
        if(head==null)
        {
        head=new Node(x);
        return head;
        }
        Node temp=new Node(x);
        Node th=head;
        while(th.next!=null)
        {
            th=th.next;
            
        }
        th.next=temp;
        
        return head;
    }
}
