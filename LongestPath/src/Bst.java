
public class Bst {

	Node newNode(int data) 
	{
		Node temp = new Node();
		temp.key = data;
		temp.left = null;
		temp.right = null;
		return temp;
		}
	Node insert(Node root, int key) 
	{
		Node newnode = newNode(key);
		Node x = root;
		Node current_parent = null;
		while (x != null) 
		{
			current_parent = x;
			if (key < x.key)
				x = x.left;
			else if (key > x.key)
				x = x.right;
			else 
			{
				System.out.println("Value already exists!!!");
				return newnode;
				}
			}
	
	if (current_parent == null)
		current_parent = newnode;
	else if (key < current_parent.key)
	current_parent.left = newnode;
	else
		current_parent.right = newnode;
	
	

return current_parent;

	}
}
