
public class Node {

	private Node right;
	private int data;
	private Node left;

	public Node(int d) {
		right = null;
		data = d;
		left = null;

	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public String toString() {
		String str = "";

		str = data + ", ";

		return str;
	}
}
