class Solution {
    // Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int w, Item arr[], int n) {
        // Your code here
        double ratio[][] = new double[n][2];
        for(int i=0;i<n;i++)
        {
            ratio[i][0]=i;
            ratio[i][1]=arr[i].value/(double)arr[i].weight;
        }
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        int capacity=w;
        double finalval=0.0;
        for(int i=n-1;i>=0;i--)
        {
            int index=(int)ratio[i][0];
            if(capacity>=arr[index].weight)
            {
                finalval=finalval+arr[index].value;
                capacity=capacity-arr[index].weight;
            }
            else
            {
                finalval+=(ratio[i][1]*capacity);
                break;
            }
        }
        return finalval;
    }
}
