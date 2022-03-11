

public class StudQueue {

	Students[] arr;
	int F;
	int R;

	StudQueue() {
		arr = new Students[5];
		F = R = -1;
	}

	StudQueue(int size) {
		arr = new Students[5];
		F = R = -1;
	}

	public void insert(Students value) {

		if ((F == 0 && R == arr.length - 1) || (F == R + 1)) {
			System.out.println("Queue is full!");
		}

		else {
			if (R == arr.length - 1)
				R = 0;

			else
				R++;
			arr[R] = value;

			if (F == -1) {
				F++;
			}

		}
	}

	public Students remove() {
		Students value =null;
		if (F == -1)
			System.out.println("Queue is empty ");

		else {
			value = arr[F];
			
			if (F == R)
				F = R = -1;
			else {
				if (F == arr.length - 1)
					F = 0;
				else
					F++;

			}

		}
		return value;
	}


	public String toString() {
		String str="";
		
		if(F==-1)
			System.out.println("Queue is empty ");
		
		else
		{
			int i=F;
			while(i!=R)
			{
				str=str+arr[i]+ ", " ;
				
				if(i==arr.length-1)
					i=0;
				else
					i++;
				
			}
			str=str+arr[i];
		}
		
		return str;
	}

	
	
}
