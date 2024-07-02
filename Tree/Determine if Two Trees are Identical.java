class Solution
{
    //Function to check if two trees are identical.
	boolean isIdentical(Node root1, Node root2)
	{
	    // Code Here
	    //if both trees are empty they are equal
	  if(root1==null  && root2==null)
	  return true;
	  //if the trees are not empty
	  if(root1!=null && root2!=null)
	  {
	      return(root1.data==root2.data && isIdentical(root1.left,root2.left) && isIdentical(root1.right,root2.right));
	  }
	   return false;
	}

	
}
