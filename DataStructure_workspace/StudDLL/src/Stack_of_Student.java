
public class Stack_of_Student {

	Node head;
	Node tail;

	public Stack_of_Student() {

		head = null;
		tail = null;
	}

	public void push(Students value) {
		Node temp = new Node(value);

		if (head == null) {

			head = temp;
			tail = temp;
		}

		else {

			temp.setNext(head);
			head.setPrev(temp);
			head = temp;
		}
	}

	

	public void pop() {
		if (head == null) {
			System.out.println("LL is empty");

		} else {
			if (head.getNext() == null) {
				Node temp = head;
				head = null;
				tail = null;

			}

			else {
				Node temp = head;
				head = head.getNext();
				head.setPrev(null);

			}
		}
	}
	
	public void empty_Stack() {
		Node it = head;

		while (it != null) {
			Node temp = it.getNext();
			it.setNext(null);
			it = temp;
		}
		head = tail = null;
		System.out.println("Empty");
	}

	

	public String toString() {

		String str = "";

		Node it = head;
		while (it != null) {
			str += "" + it + "";
			it = it.getNext();
		}

		return str;

	}

}
