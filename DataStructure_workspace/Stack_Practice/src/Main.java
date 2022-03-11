
public class Main {
	
	public static void main(String[] args) {
		Stack s=new Stack();
		Stack s1 = new Stack(22);
		
		s.push(55);
		s.push(56);
		s.push(57);
		s.push(58);
		s1.push(66);
		s.pop();
		
		System.out.println(s);
		System.out.println(s1);
				
	}

}
