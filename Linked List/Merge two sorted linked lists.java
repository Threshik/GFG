class LinkedList
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node head1, Node head2) {
     // This is a "method-only" submission. 
     // You only need to complete this method
     Node t1 = head1;
     Node t2 = head2;
     Node dn = new Node(-1);
     Node temp=dn;
     while(t1!=null && t2!=null)
     {
         if(t1.data<t2.data)
         {
             temp.next=t1;
             temp=t1;
             t1=t1.next;
         }
         else
         {
             temp.next=t2;
             temp=t2;
             t2=t2.next;
         }
     }
     if(t1!=null)
     temp.next=t1;
     else
     temp.next=t2;
  
  return dn.next;
    }
}
