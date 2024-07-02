class Solution {
    public int isLengthEvenOrOdd(Node head) {
        // code here
        Node th = head;
        if(head==null)
        return 0;
        int count=0;
        while(th!=null)
        {
            count++;
            th=th.next;
        }
        if(count%2==0)
        return 0;
        return 1;
    }
}
