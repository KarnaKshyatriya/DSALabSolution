import java.util.ArrayList;
import java.util.Scanner;

public class LongestPath {
	
	Bst bst;
	Logic lg;
	Node root = null;
LongestPath()
{
	Scanner sc = new Scanner(System.in);
	int value;
		
	bst=new Bst();
	
	System.out.println("Enter the number of nodes for the BST");
	int size=sc.nextInt();
	int[] arr=new int[size];
	
	
	for (int i = 0; i < arr.length; i++)
	{
		 arr[i]=sc.nextInt();
	}
	for (int i = 0; i < arr.length; i++)
	{
		value=arr[i];
	if (root == null)
	{
		root = bst.insert(root, value);
		}
	else 
	{
		bst.insert(root, value);
		}
	}
	
	lg=new Logic();
	ArrayList<Integer> answer=lg.longestPath(root);
	int n = answer.size();
    
	System.out.print(answer.get(n-1));
	
    for(int i = n - 2; i >= 0; i--)
    {
        System.out.print(" --> "+answer.get(i));
    }
	
	sc.close();
}

public static void main(String args[])
{
	new LongestPath();
	
}
}
	
	


