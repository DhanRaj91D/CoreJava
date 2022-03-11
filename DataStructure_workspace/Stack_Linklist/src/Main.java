import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Stack_Linklist stack_Linklist=new Stack_Linklist();
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
					stack_Linklist.push(num);
					System.out.println("Inserted sucsessfully: ");
					break;
				
			case 2 : stack_Linklist.pop();
					break;
			
			case 3 :System.out.println("Your Stack Linklist contain: ");
					System.out.println(stack_Linklist);
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
		System.out.println("\n1.Push \n2.pop\n3.Display\n4.Exit");
		System.out.println("*******************************************");
		System.out.println("*******************************************");
		System.out.println("*Enter your choice                        *");
		
		System.out.println("*******************************************");
		
	}
		
	}


