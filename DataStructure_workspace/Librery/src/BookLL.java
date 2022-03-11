
public class BookLL {

	Node head;

	public BookLL() {
		head = null;
	}

	public void append(Book data) {
		Node temp = new Node(data);
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

	public void delete_all() {
		Node it = head;

		while (it != null) {
			Node temp = it;
			it = it.getNext();
			temp.setNext(null);

		}
		head = null;
	}

	public void update_qty(int bookID) {
		Node it = head;

		while (it != null) {
			if (it.getData().getBookID() == bookID) {
				System.out.println("Qty available : " + it.getData().getQty());
			}

			it = it.getNext();
		}

	}

	
	public String toString()
	{
		String str="";
		
		Node it=head;
		
		if(it==null)
		{
			System.out.println("BookLL is Empty : ");
		}
		
		else
		{
			while(it!=null)
			{
				str += it+"--> ";
				
				it=it.getNext();
			}
		}
		return str;
		
	}
	
	
}
