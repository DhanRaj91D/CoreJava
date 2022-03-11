
public class Node {

	private Employee data;
	private Node next;
	private Node prev;

	public Node(Employee d) {
		data = d;
		next = null;
		prev = null;
	}

	public Employee getData() {
		return data;
	}

	public void setData(Employee data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public String toString() {
		String str = "";

		str = "" + data + "";
		return str;
	}
}
