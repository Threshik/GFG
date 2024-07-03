class Solution
{
    //Function to find the maximum number of activities that can
    //be performed by a single person.
    public static int activitySelection(int start[], int end[], int n)
    {
        // add your code here
        //create a 2d array activites
        int[][] activities = new int[start.length][3];
        for(int i=0;i<start.length;i++)
        {
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2])); //lambda expressions
        
        int maxact=1;
        int lastend = activities[0][2];
        for(int i=0;i<end.length;i++)
        {
            if(activities[i][1]>lastend)
            {
                maxact++;
                lastend=activities[i][2];
            }
        }
        return maxact;
    }
}
