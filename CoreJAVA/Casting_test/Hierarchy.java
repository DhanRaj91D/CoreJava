package study.Castingtest;

public class Hierarchy {

	public static void main(String[] args) {

		//show1(new F());
		show2(new F());
		/*show3(new C());
		show4(new D());
		show5(new E());
		show6(new F());*/

	}

	private static void show1(A obj) {

		obj.fa();// A itself can acces itself
		/*
		 * obj.fb(); obj.fc(); obj.fd(); obj.fe(); obj.ff();
		 */
		if (obj instanceof B) {
			B temp = (B) obj;
			temp.fb();
		}

		if (obj instanceof C) {
			C temp = (C) obj;
			temp.fc();
		}
		if (obj instanceof D) {
			D temp = (D) obj;
			temp.fd();
		}
		if (obj instanceof E) {
			E temp = (E) obj;
			temp.fe();
		}
		if (obj instanceof F) {
			F temp = (F) obj;
			temp.ff();
		}

	}

	private static void show2(B obj) {
		obj.fa();// As A in top in the hirarky of b so we cal directly print them
		obj.fb();// B itself can acces itself
		/*
		 * obj.fc(); obj.fd(); obj.fe(); obj.ff();
		 */

		if (obj instanceof C) {
			C temp = (C) obj;
			temp.fc();
		}
		/*
		 * if (obj instanceof D) { D is not in hirrarky of B SO here error occurce D
		 * temp = (D) obj; temp.fd(); }
		 */

		if (obj instanceof E) {
			E temp = (E) obj;
			temp.fe();
		}
		if (obj instanceof F) {
			F temp = (F) obj;
			temp.ff();
		}
	}

	private static void show3(C obj) {
		obj.fa();// As A and B are in top in the hirarky of b so we cal directly print them
		obj.fb();
		obj.fc();// C itself can acces itself
		/*
		 * obj.fd(); obj.fe(); obj.ff();
		 */

		/*
		 * if (obj instanceof D) { D and E is not in hirrarky of C SO we cannot access
		 * them D temp = (D) obj; temp.fd(); }
		 * 
		 * if (obj instanceof E) { E temp = (E) obj; temp.fe(); }
		 */

		if (obj instanceof F) {
			F temp = (F) obj;
			temp.ff();
		}
	}

	private static void show4(D obj) {

		obj.fa();// A is superclass so can acces it
		obj.fd();// A itself can acces itself
		/*
		 * obj.fb(); As there is nothing in the hirarky of D we cannot acess any class
		 * so error come at compiletime obj.fc();
		 * 
		 * obj.fe(); obj.ff(); if (obj instanceof B) { B temp = (B) obj; temp.fb(); }
		 * 
		 * if (obj instanceof C) { C temp = (C) obj; temp.fc(); } if (obj instanceof D)
		 * { D temp = (D) obj; temp.fd(); } if (obj instanceof E) { E temp = (E) obj;
		 * temp.fe(); } if (obj instanceof F) { F temp = (F) obj; temp.ff(); }
		 */

	}

	private static void show5(E obj) {

		obj.fa();// A itself can acces itself
		obj.fe();
		/*
		 * obj.fd(); obj.fb(); As there is nothing in the hirarky of D we cannot acess
		 * any class so error come at compiletime obj.fc();
		 * 
		 * 
		 * obj.ff(); if (obj instanceof B) { B temp = (B) obj; temp.fb(); }
		 * 
		 * if (obj instanceof C) { C temp = (C) obj; temp.fc(); } if (obj instanceof D)
		 * { D temp = (D) obj; temp.fd(); } if (obj instanceof E) { E temp = (E) obj;
		 * temp.fe(); } if (obj instanceof F) { F temp = (F) obj; temp.ff(); }
		 */

	}

	private static void show6(F obj) {

		obj.fa();// A is super class so can acces it
		obj.fb();
		obj.fc();
		obj.ff();// F itself can acces itself
		/*
		 * obj.fd(); obj.fe();
		 */

	}

}

class A {
	void fa() {
		System.out.println("in class fa");
	}
}

class B extends A {
	void fb() {
		System.out.println("in class fb");
	}
}

class C extends B {
	void fc() {
		System.out.println("in class fc");
	}
}

class D extends A {
	void fd() {
		System.out.println("in class fd");
	}
}

class E extends B {
	void fe() {
		System.out.println("in class fe");
	}
}

class F extends C {
	void ff() {
		System.out.println("in class ff");
	}
}
