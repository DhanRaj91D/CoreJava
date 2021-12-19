package BookExapmle;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class BookIOOperation implements Serializable {

	public static void writeToFile(ArrayList<Book> list) {
		ObjectOutputStream oout = null;
		try {
			oout = new ObjectOutputStream(new FileOutputStream(
					"C:\\Users\\Dhanraj\\OneDrive\\Desktop\\029_Dhanraj_dhumal\\Q1\\src\\book.bingo"));
			Iterator<Book> it = list.iterator();
			while (it.hasNext()) {
				Book obj = it.next();

				oout.writeObject(obj);
			}

		} catch (IOException e) {

		}

		finally {
			if (oout != null)
				try {
					oout.flush();
				} catch (IOException e) {

				}

			if (oout != null) {
				try {
					oout.close();
				} catch (IOException e) {

				}
			}

		}

	}// end of writetofile

}
