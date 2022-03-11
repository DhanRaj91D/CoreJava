import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		CircularLL L1=new CircularLL();
		Scanner sc = new Scanner(System.in);
		int choice=0;
	
		
		/*L1.insert(11);
		L1.insert(22);
		L1.insert(33);
		L1.insert(44);
		L1.insert(55); 
		L1.insert(66);
		L1.append(10);
		L1.insert_By_pos(33, 3);
		L1.insert(66);
		L1.append(15);
		L1.delete_first();
		L1.delet_last();          
		L1.delet_last2();
		L1.delete_By_Pos(3);
		L1.reverse();*/
		System.out.println("**************** Welcome *************");
		while(true) {            
			
			ShowMenue(sc);
			choice=sc.nextInt();
			System.out.println("");
			System.out.println("");
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-==-=");
			
			if(choice==9)
			{
				break;
			}
			switch(choice)
			
			
			 
			{
			
			case 1 :System.out.println("Enter value to insert : ");
					int num=sc.nextInt();
					L1.insert(num);
					System.out.println("Inserted sucsessfully: ");
					break;
				
			case 2 :System.out.println("Enter value to insert last : ");
					int n=sc.nextInt();
					L1.append(n);
					break;
					
			case 3 :System.out.println("Enter value to insert & position  : ");
					int value=sc.nextInt();
					int pos=sc.nextInt();
					L1.insert_By_pos(value, pos);
					break;
					
			case 4 : L1.delete_first();
					break;
			
			case 5 :L1.delet_last();
					break;
					
					
			case 6 : System.out.println("Enter the position which you want to delete  : ");
					int pos1=sc.nextInt();
					L1.delete_By_Pos(pos1);
					break;
					
			case 7 : L1.reverse();
					break;
				
			case 8 :System.out.println(L1);
					break;
			
			default: break;
			
			}
			
			
			}
		}

	
	private static void ShowMenue(Scanner sc) {
		
	
		System.out.println("*******************************************");
		System.out.println("*            Operations avilable          *");
		System.out.println("*******************************************");
		System.out.println("*\n1.Insert \n2.Append\n3.Insert by position\n4.Delet first node\n5.Delete last node\n6.Delete node by position\n7.Reverse Linklist\n8.Display\n ");
		System.out.println("*******************************************");
		System.out.println("*******************************************");
		System.out.println("*Enter your choice                        *");
		
		System.out.println("*******************************************");
		
	}
		
	}


