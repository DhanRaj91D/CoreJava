
public class Node {

	private Employee data;
	private Node next;
	
	public Node()
	{
		data=null;
		next=null;
	}
	
	public Node(Employee value)
	{
		data= value;
		next=null;
	}
	
	public Node(Employee value, Node n)
	{
		data=value;
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
	
	public String toString()
	{
		String str="";
		
		str= str + data +"-->\n";
		
		return str;
	}
	
	
	
}
