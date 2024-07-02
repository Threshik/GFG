class GfG
{
   
    public static int getNth(Node node, int ind)
    {
       //Your code here
       if(node==null)
       return -1;
       Node th = node;
       int count=1;
       while(th!=null)
       {
           if(count==ind)
           return th.data;
           count++;
           th=th.next;
       }
     
       return -1;
       
    }
}
