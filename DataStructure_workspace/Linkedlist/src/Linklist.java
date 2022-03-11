
public class Linklist {

	Node head;

	public Linklist() {
		head = null;
	}

	public void insert(int value) {
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

	public void append(int value) {
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

			for (int i = 0; i < (pos - 1); i++) {
				it = it.getNext();
			}
			Node temp = it.getNext();
			it.setNext(temp.getNext());
			temp.setNext(null);

		}

	}

	public void deleteOdd() {

		if (head == null)
			System.out.println("LL is empty");
		Node temp = head;

		head = head.getNext();
		temp = null;

		Node it = head;

		while (it != null && it.getNext()!=null) {
			temp = it.getNext();
			it.setNext(it.getNext().getNext());
			it=it.getNext();
			temp = null;
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

	public void MergeLL(Linklist l, Linklist l1) {
		Node it = l.head;
		Node it1 = l1.head;

		while (it != null && it1 != null) {

			if (it.getData() > it1.getData()) {

				this.append(it.getData());
				it = it.getNext();
			}

			else if (it1.getData() > it.getData()) {
				this.append(it1.getData());
				it1 = it1.getNext();
			}

			else {
				this.append(it1.getData());
				it = it.getNext();
				it1 = it1.getNext();
			}

		}

		while (it != null) {
			this.append(it.getData());
			it = it.getNext();

		}
		while (it1 != null) {
			this.append(it1.getData());
			it1 = it1.getNext();

		}

	}

	private int noOfNodes() {
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

			str += "" + it;
			it = it.getNext();
		}
		return str;
	}

}
