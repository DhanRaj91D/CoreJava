package WrapperEx;

public class CmdTest3 {
	public static void main(String[] args) {

		
		WordConvertor wordConvertor=new WordConvertor();
		String word=wordConvertor.getNumbersInWords(args[0]);
		
		System.out.println(word);
		
		

	}
}
