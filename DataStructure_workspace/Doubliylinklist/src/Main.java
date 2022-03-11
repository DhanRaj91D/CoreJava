
public class Main {

	public static void main(String[] args) {

		Dlinklist l1 = new Dlinklist();

		l1.insert(10);
		l1.insert(20);
		l1.insert(30);
		l1.insert(40);
		l1.insert(50);
		l1.append(11);
		System.out.println(l1);
		
		l1.insert_By_pos(555, 5);
		
		System.out.println(l1);

		

	}
}
