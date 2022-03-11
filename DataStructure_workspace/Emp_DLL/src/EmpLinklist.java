
public class EmpLinklist {

	Node head;
	Node tail;

	public EmpLinklist() {

		head = null;
		tail = null;
	}

	
	public void insert(Employee  value) {
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

	
	public void remove() {
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
				temp.setNext(null);

			}
		}
	}

	
	public void emp_by_Gender(char c)
	{
		Node it=head;
		
		while(it!=null)
		{
			if(it.getData().getGender()== c)
			{
				System.out.println(it);
			}
			
			it=it.getNext();
		}
	}


	public void empty_Queue() {
		Node it = head;

		while (it != null) {
			Node temp = it.getNext();
			it.setNext(null);
			it = temp;
		}
		head = tail = null;

	}
	
	public boolean is_Empty()
	{
		if(head==null)
			return true;
		
		else
			return false;
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
