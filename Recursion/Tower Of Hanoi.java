class Hanoi {
long count=0;
    public long toh(int n, int from, int to, int aux) {
        // Your code here
        
        if(n==1)
        {
            count++;
            System.out.println("move disk "+n+" from rod "+from+" to rod "+to);
            return count;
        }
        else
        {
        toh(n-1,from,aux,to);
        count++;
        System.out.println("move disk "+n+" from rod "+from+" to rod "+to);
        toh(n-1,aux,to,from);
        }
        return count;
    }
}
