
public class Dlinklist {

	Node head;
	Node tail;

	public Dlinklist() {

		head = null;
		tail = null;
	}

	public void insert(int value) {
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

	public void append(int value) {
		Node temp = new Node(value);

		if (tail == null) {
			tail = temp;
			head = temp;

		}

		else {
			tail.setNext(temp);
			temp.setPrev(tail);
			tail = temp;

		}

	}

	public void insert_By_pos(int value, int pos) {
		int noOfNode = noOfNode();
		if (pos == 1) {
			insert(value);
		}

		else if (pos == noOfNode + 1) {
			append(value);

		}

		else if ((pos > 1) && (pos < (noOfNode + 1))) {

			Node temp = new Node(value);

			Node it = head;

			for (int i = 1; i < pos ; i++) {

				it = it.getNext();
			}

			/*temp.setNext(it.getNext());
			it.setNext(temp);
			temp.setPrev(it);*/
			
			temp.setPrev(it.getPrev());
			it.setPrev(temp);
			temp.setNext(it);
			temp.getPrev().setNext(temp);
			
			

		}

	}

	public void delete_first() {
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

	public void delet_last() {
		if (head == null) {
			System.out.println("LL is empty");

		} else {
			if (head.getNext() == null) {
				Node temp = head;
				head = null;
				tail = null;

			}

			else {

				Node temp = tail;
				tail = tail.getPrev();
				tail.setNext(null);
				temp.setPrev(null);

			}

		}

	}

	public void delet_By_pos(int pos) {
		int noOfNode = noOfNode();
		if (pos == 1)
			delete_first();

		else if (pos == noOfNode)
			delet_last();

		else if (pos > 1 && (pos < noOfNode )) {
			Node it = head;
			for (int i = 1; i < pos+1; i++) {

				it = it.getNext();
			}

			it.getPrev().setNext(it.getNext());
			it.getNext().setPrev(it.getPrev());
			it.setNext(null);
			it.setPrev(null);

		}

		else {
			System.out.println("invalid entry");
		}

	}

	public void reverse() {
		Node it = head;

		while (it != null) {
			Node temp = it.getPrev();
			it.setPrev(it.getNext());
			it.setNext(temp);
			it = it.getPrev();
		}

		Node temp = head;
		head = tail;
		tail = temp;

	}

	public void empty() {
		Node it = head;

		while (it != null) {
			Node temp = it.getNext();
			it.setNext(null);
			it = temp;
		}
		head = tail = null;

	}

	

	private int noOfNode() {
		int noOfNode = 0;
		Node it = head;

		while (it != null) {
			noOfNode++;
			it = it.getNext();
		}

		return noOfNode;
	}

	public String toString() {

		String str = "";

		Node it = head;
		while (it != null) {
			str += "" + it + "-->";
			it = it.getNext();
		}

		return str;

	}

}
