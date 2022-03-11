package study.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDao {

	public Connection makeConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		String url = "jdbc:mysql://localhost:3306/adv_java";
		String user = "root";
		String password = "root";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return con;
	}

	public BookPojo getBookinfo(int bookId) {
		Connection con = this.makeConnection();

		String sql = "select * from bookshop where book_id=?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bookId);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				BookPojo obj = new BookPojo();
				obj.setBookid(rs.getInt(1));
				obj.setBookname(rs.getString(2));
				obj.setBookcost(rs.getInt(3));

				return obj;

			}

			else {
				return null;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;

	}

	public List<BookPojo> getAllBooks()

	{

		Connection con = this.makeConnection();

		ArrayList<BookPojo> al = new ArrayList<BookPojo>();

		String sql = "select * from bookshop";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				BookPojo obj = new BookPojo();
				obj.setBookid(rs.getInt(1));
				obj.setBookname(rs.getString(2));
				obj.setBookcost(rs.getInt(3));

				al.add(obj);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return al;

	}
}
