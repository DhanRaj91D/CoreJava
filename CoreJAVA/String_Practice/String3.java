package study;

public class String3 {
	public static void main(String[] args) {
		
		String str="1111100000011111";
		
		String str2=str.substring(str.indexOf("1"),str.indexOf("0"));
		
		System.out.println("New string = "+str2);
		
	}
}
