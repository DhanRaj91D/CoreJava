package WrapperEx;

public class WordConvertor {
	int count = 0;

	public String getNumbersInWords(String str) {
		String finalStr = " ";

		int num = Integer.parseInt(str);
		if (num < 10000) {
			int unitPlace = num % 10;
			System.out.println("unitPlace : " + unitPlace);
			int tensPlace = (num % 100) / 10;
			System.out.println("tensPlace : " + tensPlace);
			int hundPlace = (num % 1000) / 100;
			System.out.println("hundPlace : " + hundPlace);
			int thousPlace = (num / 1000);
			System.out.println("thousPlace :" + thousPlace);

			finalStr += getWord(thousPlace);
			finalStr += getWord(hundPlace);
			finalStr += getWord(tensPlace);
			finalStr += getWord(unitPlace);

		} else {
			return "Invalid number";
		}
		return finalStr;
	}

	private String getTength(int num) {
		switch (num) {

		case 1:
			return " Eleven";

		case 2:
			return " Twelve  ";

		case 3:
			return " Thirteen  ";

		case 4:
			return " Fourteen ";

		case 5:
			return " Fifteen";

		case 6:
			return " Sixteen  ";

		case 7:
			return " Seventeen  ";

		case 8:
			return " Eighteen ";

		case 9:
			return " Nineteen  ";

		default:
			return "";

		}

	}

	private String getWord(int num) {

		count++;
		if (count < 5) {

			switch (num) {

			case 1:
				if (count == 1)
					return " One thousond";
				else if (count == 2)
					return " One hundrade";
				else if (count == 3) {
					count++;
					return "";
					}
				else
					return " One";
				

			case 2:
				if (count == 1)
					return " Two thousond";
				else if (count == 2)
					return " Two hundrade";
				else if (count == 3)
					return " Twenty";
				else
					return " Two";

			case 3:
				if (count == 1)
					return " Three thousond";
				else if (count == 2)
					return " Three hundrade";
				else if (count == 3)
					return " Thirty";
				else
					return " Three";
			case 4:
				if (count == 1)
					return " Four thousond";
				else if (count == 2)
					return " Four hundrade";
				else if (count == 3)
					return " Fourty";
				else
					return " Four";

			case 5:
				if (count == 1)
					return " Five thousond";
				else if (count == 2)
					return " Five hundrade";
				else if (count == 3)
					return " Fifty";
				else
					return " Five";

			case 6:
				if (count == 1)
					return " Six thousond";
				else if (count == 2)
					return " Six hundrade";
				else if (count == 3)
					return " Sixty";
				else
					return " Six";

			case 7:
				if (count == 1)
					return " Seven thousond";
				else if (count == 2)
					return " Seven hundrade";
				else if (count == 3)
					return " Seventy";
				else
					return " Seven";

			case 8:
				if (count == 1)
					return " Eight thousond";
				else if (count == 2)
					return " Eight hundrade";
				else if (count == 3)
					return " Eighty";
				else
					return " Eight";

			case 9:
				if (count == 1)
					return " Nine thousond";
				else if (count == 2)
					return " Nine hundrade";
				else if (count == 3)
					return " Ninety";
				else
					return " Nine";

			default:
				if (count == 1)
					return " ";
				else if (count == 2)
					return " ";
				else if (count == 3)
					return " ";
				else
					return " ";

			}
		} else {
			return getTength(num);
		}

	}

}
 