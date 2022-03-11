
public class EmpLinklist {

	Node head;

	public EmpLinklist() {
		head = null;
	}

	public void insert(Employee value) {
		
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

	public void insert_By_pos(Employee value, int pos) {
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
  
	public void details_by_ID(int id)
	{
		Node it =head;
		
		
		while(it!=null)
		{
			
			
			if(it.getData().getEmpId()==id)
			{
				System.out.println(it);
				break;
			}
			it=it.getNext();
			
		}
		
	}
	
	public void Salary_less_than(int sal)
	{
		Node it =head;
		
		while(it!=null)
		{
			if(it.getData().getSalary()<sal)
			{
				
				System.out.println(it);
				
			}
			it=it.getNext();
			
		}
		
	}
	
	public void name_Startwith(char c)
	{
		Node it =head;
		while(it!=null)
		{
			if(it.getData().getName().charAt(0)==c)
			{
				System.out.println(it);
				
			}
			it=it.getNext();
		}
		
	}
	
	public void Delete_data()
	{
		Node it =head;
		while(it!=null)
		{
			
			it.setData(null);
			it=it.getNext();
			
		}
	}
	
	public void delete_LL()
	{
		Node it=head;
		
		while(it!=null)
		{
			Node itn=it.getNext();
			it.setNext(null);
			it=itn;
			
		}
		
		head=null;
		
		System.out.println("Done");
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

			str += "" + it + "\n";
			it = it.getNext();
		}
		return str;
	}

	

}
