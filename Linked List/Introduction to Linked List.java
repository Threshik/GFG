class Solution {
    static Node constructLL(int arr[]) {
        // code here
        Node head=new Node(arr[0]);
        Node th = head;
        for(int i=1;i<arr.length;i++)
        {
            Node temp = new Node(arr[i]);
            th.next = temp;
            th=th.next;
        }
        return head;
    }
}
