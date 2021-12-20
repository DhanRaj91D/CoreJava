import java.util.Scanner;
public class main {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many employee you want to store ");
		int num =sc.nextInt();
		
		emp []e=new emp[num];
		
		populate_emp(e,sc);
			
		for(int i=0;i<e.length;i++)
		{
			System.out.println(e[i]);
		}
		
	}

	private static emp[] populate_emp(emp[] e, Scanner sc) {
		
		int ID;
		String name;
	    int sal;
	    String Street_name;
		String Building_name;
		int Pin_code;
		
		for(int i =0;i<=e.length-1;i++)
		{
			System.out.println("Enter the emp ID :");
			ID=sc.nextInt();
			
			System.out.println("Enter the name of employee");
			name = sc.next();
			
			System.out.println("Enter the Salery :");
			sal=sc.nextInt();
			
			System.out.println("Enter the address");
			System.out.println("Street_name : ");
			Street_name=sc.next();
			System.out.println("Building_name : ");
			Building_name=sc.next();
			System.out.println("Pin_code : ");
			Pin_code=sc.nextInt();

			e[i]=new emp(ID,name,sal,Street_name,Building_name,Pin_code);
			
			
		}
		return e;
		
	}
}
