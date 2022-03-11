package study.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;


@Component("book1")
public class BookDAO {
	
	@Autowired
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
