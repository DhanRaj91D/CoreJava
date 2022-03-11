
public class EmpLL {
	Node head;

	public EmpLL() {
		head = null;
	}

	public void insert(Employee value) {
		Node temp = new Node(value);

		if (head == null) {
			head = temp;
		}

		else {
			temp.setNext(head);
			head = temp;

		}

	}

	public void append(Employee value) {
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

	public void set_by_pos(Employee value, int pos) {
		int noOfNosdes = noOFNode();
		if (pos == 1) {
			insert(value);
		}

		else if (pos == (noOfNosdes + 1)) {
			append(value);
		}

		else if (pos > 1 && pos < (noOfNosdes + 1)) {
			Node temp = new Node(value);
			Node it = head;

			for (int i = 1; i < (pos - 1); i++) {
				it = it.getNext();
			}

			temp.setNext(it.getNext());
			it.setNext(temp);

		} else {
			System.out.println("Invalid position");
		}

	}

	public void delet_first() {
		if (head == null) {
			System.out.println("LL is empty");
		} else if (head.getNext() == null) {
			Node temp = head;
			head = null;
		}

		else {
			Node temp = head;
			head = temp.getNext();
			temp = null;
		}

	}

	public void delet_last() {
		if (head == null) {
			System.out.println("LL is empty ");

		}

		else {
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

	public void delete_by_pos(int pos) {
		int noOfNode = noOFNode();

		if (pos == 1) {
			delet_first();
		}

		else if (pos == noOfNode) {
			delet_last();
		}

		else if (pos > 1 && pos < noOfNode) {
			
			Node it =head;
			
			for(int i=1;i<(pos-1);i++)
			{
				it=it.getNext();
			}
			
			Node temp=it.getNext();
			it.setNext(temp.getNext());
			temp.setNext(null);

		}
	}
	
	public void reverse()
	{
		Node itp=null;
		Node it=head;
		Node itn=head;
		
		while(it!=null)
		{
			itn=itn.getNext();
			it.setNext(itp);
			itp=it;
			it=itn;
			
		}
		
		head=itp;
	}
	

	private int noOFNode() {

		Node it = head;
		int count = 0;
		while (it != null) {
			count++;
			it = it.getNext();
		}
		return count;
	}

	public String toString()
	{
		String str="";
		Node it=head;
		
		while(it!=null)
		{
			str+=" "+ it+" \n";
			it=it.getNext();
		}
		return str;
	}
}
