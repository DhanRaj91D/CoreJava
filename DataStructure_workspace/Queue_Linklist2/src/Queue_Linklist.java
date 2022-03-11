
public class Queue_Linklist {

	Node head;

	public Queue_Linklist() {
		head = null;
	}

	public void Insert(int value) {
		Node temp = new Node(value);

		if (head == null) {
			head = temp;

		}

		else {
			Node it = head;

			while (it.getNext() != null) {
				it = it.getNext();
			}

			it.setNext(temp);

		}

	}

	public void remove() {

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
