class Solution {
    static boolean searchKey(int n, Node head, int key) {
        // Code here
        if(head==null)
        return false;
        Node th = head;
        while(th!=null)
        {
            int val=th.data;
            if(val==key)
            return true;
            th=th.next;
        }
        return false;
    }
}
