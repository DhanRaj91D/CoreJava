package study;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;



public class BookDAO {
	
	
	private DataSource ds;

	public DataSource getDs() {
		return ds;
	}

	public void setDs(DataSource ds) {
		this.ds = ds;
	}
	
	
	public void addBook(int id, String name,int cost)
	{
		
		try {
			Connection con =ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into bookshop values(?,?,?)");
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, cost);
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
	}

}
