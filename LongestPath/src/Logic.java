import java.util.ArrayList;

public class Logic {
	
	
	public ArrayList<Integer> longestPath(Node root)
	{
	     
	    
	    if(root == null)
	    {
	        ArrayList<Integer> output = new ArrayList<>();
	        return output;
	    }
	     
	    // Recursive call on root.right
	    ArrayList<Integer> right = longestPath(root.right);
	     
	    // Recursive call on root.left
	    ArrayList<Integer> left = longestPath(root.left);
	     
	    // Compare the size of the two ArrayList
	    // and insert current node accordingly
	    if(right.size() < left.size())
	    {
	        left.add(root.key);
	        
	    }
	    else
	    {
	        right.add(root.key);
	        
	    }
	     
	    // Return the appropriate ArrayList
	    return (left.size() >
	            right.size() ? left :right);
	}
	
	

}
