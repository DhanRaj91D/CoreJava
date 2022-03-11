         
public class Node {
	private int data;
	private Node next;
	
	public Node(int d)
	{
			data=d;
			next=null;
	}
	
	public Node(int d, Node n)
	{
			data=d;
			next=n;
	}
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
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
		
		str= ""+data+"-->";
		return str;
	}
}
