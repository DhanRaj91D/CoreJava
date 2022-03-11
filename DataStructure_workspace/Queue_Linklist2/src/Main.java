import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Queue_Linklist L1=new Queue_Linklist();
		Scanner sc = new Scanner(System.in);
		int choice=0;
	
		
		System.out.println("***************** Welcome *****************");
		System.out.println();
		System.out.println();
		while(true) {            
			
			ShowMenue(sc);
			choice=sc.nextInt();
			
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-==-=");
			
			if(choice == 4)
			{
				break;
			}
			switch(choice)
			
			
			 
			{
			
			case 1 :System.out.println("Enter value to insert : ");
					int num=sc.nextInt();
					L1.Insert(num);
					System.out.println("Inserted sucsessfully: ");
					break;
				
			case 2 : L1.remove();
					break;
			
			case 3 :System.out.println("Your Queue Linklist contain: ");
					System.out.println(L1);
					System.out.println();
					System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-==-=");
					break;
			
					
			default: break;
			
			}
			
			
			}
		}

	private static void ShowMenue(Scanner sc) {
		
	
		System.out.println("*******************************************");
		System.out.println("*            Operations avilable          *");
		System.out.println("*******************************************");
		System.out.println("\n1.Insert \n2.Remove\n3.Display\n4.Exit");
		System.out.println("*******************************************");
		System.out.println("*******************************************");
		System.out.println("*Enter your choice                        *");
		
		System.out.println("*******************************************");
		
	}
		
	}


