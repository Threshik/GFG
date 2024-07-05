class Solution
{
    /*You are required to complete this method*/
    int findK(int A[][], int n, int m, int k)
    {
	// Your code here
	int top=0;
	int bottom=n-1;
	int left=0;
	int right=m-1;
	List<Integer> res = new ArrayList<>();
	while(top<=bottom && left<=right)
	{
	    for(int i=left;i<=right;i++)
	    {
	        res.add(A[top][i]);
	    }
	    top++;
	    for(int i=top;i<=bottom;i++)
	    {
	        res.add(A[i][right]);
	    }
	    right--;
	    if(top<=bottom)
	    {
	        for(int i=right;i>=left;i--)
	        {
	            res.add(A[bottom][i]);
	        }
	        bottom--;
	    }
	    if(left<=right)
	    {
	        for(int i=bottom;i>=top;i--)
	        {
	            res.add(A[i][left]);
	        }
	        left++;
	    }
	}
	if(k<=res.size())
	{
	    return res.get(k-1);
	}
	else
	return-1;
    }
}
