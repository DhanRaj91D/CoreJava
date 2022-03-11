
public class CircularLL {

	Node head;

	public CircularLL() {
		head = null;
	}

	public void insert(int value) {
		Node temp = new Node(value);

		if (head == null) {
			head = temp;
			head.setNext(head);
		}

		else {
			if (head.getNext() == head) {

				temp.setNext(head);
				head.setNext(temp);
				head = temp;

			}

			else {

				Node it = head;

				while (it.getNext() != head) {
					it = it.getNext();
				}
				it.setNext(temp);
				temp.setNext(head);
				head = temp;

			}
		}
	}

	public void append(int value) {
		Node temp = new Node(value);
		if (head == null) {
			head = temp;
			head.setNext(head);
		}

		else {

				Node it = head;

				while (it.getNext() != head) {
					it = it.getNext();
				}
				it.setNext(temp);
				temp.setNext(head);
				

			}
		}
	

	public void insert_By_pos(int value, int pos) {
		int noOfNodes = noOfNodes();

		if (pos == 1) {
			insert(value);
		}

		else if (pos == (noOfNodes + 1)) {
			append(value);
		}

		else if (pos > 1 && pos < (noOfNodes + 1)) {
			Node it = head;
			Node temp = new Node(value);

			for (int i = 1; i < (pos - 1); i++) {
				it = it.getNext();
			}

			temp.setNext(it.getNext());
			it.setNext(temp);

		}

		else {
			System.out.println("Invalid pos");
		}

	}

	public void delete_first() {

		if (head == null) {
			System.out.println("LL is empty");
		}

		else

		{
			if (head.getNext() == head) {
				Node temp = head;
				temp.setNext(null);
				head = null;

			}

			else {
				Node it = head;
				do {
					it = it.getNext();
				}while (it != head);
				

			}
		}
	}

	public void delet_last() {
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
				Node it = head;

				while (it.getNext().getNext() != null) {
					it = it.getNext();
				}

				Node temp = it.getNext();
				it.setNext(null);

			}
		}

	}

	public void delet_last2() {
		if (head == null || head.getNext() == null) {
			delete_first();
		}

		else {
			Node it = head;

			while (it.getNext().getNext() != null) {
				it = it.getNext();
			}

			Node temp = it.getNext();
			it.setNext(null);

		}
	}

	public void delete_By_Pos(int pos) {

		int noOfNodes = noOfNodes();

		if (pos == 1) {
			delete_first();
		}

		else if (pos == noOfNodes) {
			delet_last();
		}

		else {
			Node it = head;

			for (int i = 1; i < (pos - 1); i++) {
				it = it.getNext();
			}
			Node temp = it.getNext();
			it.setNext(temp.getNext());
			temp.setNext(null);

		}

	}

	public void reverse() {
		Node itp = null;
		Node it = head;
		Node itn = head;

		while (it != null) {
			itn = itn.getNext();
			it.setNext(itp);
			itp = it;
			it = itn;

		}

		head = itp;

	}

	private int noOfNodes() {
		int noOfNode = 0;
		Node it = head;				 
		do {								
			noOfNode++;
			it = it.getNext();
		}while (it != head);
		return noOfNode;
	}
	

	public String toString() {
		String str = "";

		Node it = head;				//As our it is equal to head already thats why we can not use while loop here
									//thats why we need to make condition at least onse working thats why we used do while loop			
		do {

			str += "" + it;
			it = it.getNext();
		}while (it != head);
		return str;
	}

}
