
public class Main {

	public static void main(String[] args) {

		Queue q1 = new Queue();
		Queue q2 = new Queue();
		q1.insert(33);

		q1.insert(24);
		q1.insert(36);
		q1.insert(48);
		q1.remove();
		q2.sameAs(q1);
		System.out.println(q1);

	}

}
