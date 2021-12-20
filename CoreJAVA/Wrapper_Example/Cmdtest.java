package WrapperEx;
/*Accept a few numbers from the command line
Show the sum of those numbers.
( concept = command line arguments ,  Integer.parseInt( string)*/

public class Cmdtest {
	public static void main(String[] args) {
		int x;
		int res = 0;
		for (String s : args) {
			x = Integer.parseInt(s);
			res = x + res;
		}
		System.out.println(res);

	}

}
