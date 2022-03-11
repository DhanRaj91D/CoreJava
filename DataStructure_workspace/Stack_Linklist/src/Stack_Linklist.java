
public class Stack_Linklist {

	Node head;

	public Stack_Linklist() {
		head = null;
	}

	public void push(int value) {
		Node temp = new Node(value);

		if (head == null) {
			head = temp;
		} else {
			if (head.getNext() == null) {
				temp.setNext(head);
				head = temp;
			}

			else {
				temp.setNext(head);
				head = temp;
			}
		}
	}



	
	public void pop() {

		if (head == null) {
			System.out.println("LL is empty");
		}

		else

		{
			if (head.getNext() == null) {
				Node temp = head;
				head = null;

			}

			else {
				Node temp = head;
				head = temp.getNext();
				temp = null;

			}
		}
	}


	public String toString() {
		String str = "";

		Node it = head;

		while (it != null) {

			str += "" + it;
			it = it.getNext();
		}
		return str;
	}

}
