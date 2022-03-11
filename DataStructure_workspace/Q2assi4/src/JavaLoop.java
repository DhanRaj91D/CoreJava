
public class JavaLoop {

	static void power(int a, int b) {
		int power = 1;
		for (int i = 1; i <= b; i++) {
			power = power * a;
		}
		System.out.println("\n" + b + " th power of " + a + " : " + power);
	}

	static void isPrime(int a) {

		System.out.println("Prime no from 1 to " + a + " are : ");

		for (int i = 2; i <= a; i++) {

			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					count++;
			}

			if (count == 0)
				System.out.print(+i + ", ");

		}

	}

	static void fibonacci(int n) {

		int k,i = 1,j = 1;
		
		k=0;
	
			System.out.print("1 1 ");
			
			while(k<=n)
				
			{
					k=i+j;
					if(k<=n)
					System.out.print(k+ " ");
					i=j;
					j=k;
					
			}
		}

	}


