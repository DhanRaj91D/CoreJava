         
public class Node {
	private Employee data;
	private Node next;
	
	public Node(Employee value)
	{
			data=value;
			next=null;
	}
	
	public Node(Employee d, Node n)
	{
			data=d;
			next=n;
	}
	
	public Employee getData() {
		return data;
	}

	public void setData(Employee data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public String toString() {
		
		String str="";
		
		str= ""+data+"-->\n";
		
		return str;
	}
}
