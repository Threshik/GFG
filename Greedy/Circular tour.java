class Solution
{
    //Function to find starting point where the truck can start to get through
    //the complete circle without exhausting its petrol in between.
    int tour(int petrol[], int distance[])
    {
	// Your code here
	    int n = petrol.length;
	    int start=0;
	    int petrolcount=0;
	    for(int i=0;i<n;i++)
	    {
	        petrolcount=petrolcount+petrol[i]-distance[i];
	        if(petrolcount<0)
	        {
	            start=i+1;
	            petrolcount=0;
	        }
	    }
	    int totalpetrol=0;
	    int totaldistance=0;
	    for(int i=0;i<n;i++)
	    {
	       totalpetrol+=petrol[i];
	       totaldistance+=distance[i];
	    }
	    if(totalpetrol<totaldistance)
	    return -1;
	    return start;
    }
}
