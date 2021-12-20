package exeption;

public class UserMydateexep {

	public static void main(String[] args) {
		try {

			MyDateExeptry d1 = new MyDateExeptry(11, 13, 2021);

		} catch (WrongDayException e) {
			System.out.println("In first WrongDayException catch");

			e.printStackTrace();
		} catch (Exception e) {

			System.out.println("In first wrongmonth catch");
			e.printStackTrace();
		}

		try {

			MyDateExeptry d2 = new MyDateExeptry(32, 12, 2021);

		} catch (WrongDayException e) {
			System.out.println("In second Wrongdayd  xception catch");

			e.printStackTrace();
		} catch (Exception e) {

			System.out.println("In second wrongmonth catch");
			e.printStackTrace();
		}

		System.out.println("Byeee ");
	}

}
