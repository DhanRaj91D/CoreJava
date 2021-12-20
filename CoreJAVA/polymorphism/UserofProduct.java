package study.polymorphism;

public class UserofProduct {

	public static void main(String[] args) {
		Product[] arr = new Product[4];
		arr[0] = new Toy("doll", "non-battery", 300);
		arr[1] = new Dress("sherwani", "blue", "L", 2000);
		arr[2] = new Toy("car" ,"battery" ,200);
		arr[3] = new Dress("kurta", "red", "s", 1000);

		showBill(arr);
	}

	private static void showBill(Product[] arr) {
		int totalcost =0;
		
		System.out.println("**********Your bill************ ");
		for (int i = 0; i < arr.length; i++) {
			totalcost=totalcost+arr[i].getFinalCost(); 
			System.out.println(arr[i].getDesc()+", 10% Discounte price : "+arr[i].getFinalCost());
			
		}
		System.out.println("****************************************");
		System.out.println("Total Cost : "+totalcost);
	}

}
