
public class Node {

	private Node next;
	private Book data;

	public Node(Book d) {
		next = null;
		data = d;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Book getData() {
		return data;
	}

	public void setData(Book data) {
		this.data = data;
	}

	public String toString() {
		String str = "";

		str = data + "\n";

		return str;
	}

}
