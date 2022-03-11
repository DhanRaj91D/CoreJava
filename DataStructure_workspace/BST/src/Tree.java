
public class Tree {

	private Node root;

	public Tree() {
		root = null;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public void insert(int value) {
		Node temp = new Node(value);
		// if root is null that means there is noting in tree then make temp node root
		if (root == null) {
			root = temp;
		}

		else {

			Node it = root;
			while (true) {
				// it means there is nodes in tree

				if (temp.getData() < it.getData()) {
					if (it.getLeft() != null)
						it = it.getLeft();

					else {
						it.setLeft(temp);
						break;
					}
				}

				else if (temp.getData() > it.getData()) {

					if (it.getRight() != null)
						it = it.getRight();

					else {
						it.setRight(temp);
						break;
					}

				}

				else {
					System.out.println("Duplicate input");
					break;
				}

			}

		}

	}

	public void insert_rec(Tree t, int data) {
		t.setRoot(t.insert_rec(t.getRoot(), data));
	}

	private Node insert_rec(Node it, int value) {

		if (it == null) {
			it = new Node(value);
		}

		else if (value < it.getData()) {      

			it.setLeft(insert_rec(it.getLeft(), value));
		}

		else if (value > it.getData()) {
			it.setRight(insert_rec(it.getRight(), value));
		}

		else
			System.out.println("Duplicate entry ");

		return it;

	}

	
	public void preorder_print() {
		preOrder(root);
		System.out.println();
	}

	private void preOrder(Node it) {
		if (it != null) {
			System.out.println(it.getData() + ", ");
			preOrder(it.getLeft());
			preOrder(it.getRight());
		}
	}

	public void inorder_print() {
		inOrder(root);
		System.out.println();
	}

	private void inOrder(Node it) { 
		if (it != null) {
			inOrder(it.getLeft());
			System.out.println(it.getData() + ", ");
			inOrder(it.getRight());
		}
	}

	public void postorder_print() {
		postOrder(root);
		System.out.println();
	}

	private void postOrder(Node it) {

		if (it != null) {
			postOrder(it.getLeft());
			postOrder(it.getRight());
			System.out.println(it.getData() + ", ");
		}
	}
	
	public void printsmallest_val()
	{
		if(root==null)
		{
			System.out.println("Empty");
		}
		
		
		else
		{
			Node it=root;
			
			while(it.getLeft()!=null)
			{
				it=it.getLeft();
			}
			
			System.out.println(it.getData());
		}
	}
	
	public void printlargest_val()
	{
		if(root==null)
		{
			System.out.println("Empty");
		}
		
		
		else
		{
			Node it=root;
			
			while(it.getRight()!=null)
			{
				it=it.getRight();
			}
			
			System.out.println(it.getData());
		}
	}
	
	
	public void search(int value)
	{
		if(root == null)
		{
			System.out.println("Not found");
		}
		
		else
		{
			Node it = root;
			while(it!= null)
			{
				if(value==it.getData())
				{
					break;
				}
				
				else if(value<it.getData())
					it=it.getLeft();
				else
					it=it.getRight();
				
			}
			
			if(it!=null)
				System.out.println("Found");
			else
				System.out.println("Not found");
			
		}
	}
	
}
