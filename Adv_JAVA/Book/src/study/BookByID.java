package study;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BookByID")
public class BookByID extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doPost(req, resp);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		Connection con =Showbooks.makeConnection();
		Statement stmt;
		try {
			stmt = con.createStatement();
			String sql = "Select book_id from bookshop";
			ResultSet rs = stmt.executeQuery(sql);
			
			pw.append("<!doctype html>\r\n" + 
					"<html lang=\"en\">\r\n" + 
					"  <head>\r\n" + 
					"    <meta charset=\"utf-8\">\r\n" + 
					"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
					"    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n" + 
					"    <title>Insert Book </title>\r\n" + 
					"  </head>\r\n" + 
					"  <body  >\r\n" + 
					"    <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\r\n" + 
					"        <div class=\"container-fluid\">\r\n" + 
					"          <a class=\"navbar-brand\" href=\"#\">Books</a>\r\n" + 
					"          <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n" + 
					"            <span class=\"navbar-toggler-icon\"></span>\r\n" + 
					"          </button>\r\n" + 
					"          <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n" + 
					"            <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n" + 
					"              <li class=\"nav-item\">\r\n" + 
					"                <a class=\"nav-link active\" aria-current=\"page\" href=\"http://localhost:8080/Book/Bookshop.html\">Home</a>\r\n" + 
					
					"<li class=\"nav-item dropdown\">\r\n" + 
					"                <a class=\"nav-link dropdown-toggle active\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n" + 
					"                  Book By ID\r\n" + 
					"                </a>\r\n" + 
					"                <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">"
					
					);
			
			while(rs.next())
			{
				int id = rs.getInt(1);
				pw.append("<li><a class=\"dropdown-item\" href=\"SearchBookBYID\">"+id+"</a></li>");
			}
			pw.append(" </ul>\r\n" + 
					"              </li> "+ 
					"             </li>\r\n" + 
					"            </ul>\r\n" + 
					"          </div>\r\n" + 
					"        </div>\r\n" + 
					"      </nav> ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		pw.append("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\r\n" + 
				"    \r\n" + 
				"  </body>\r\n" + 
				"</html>\r\n" + 
				"");
		pw.close();
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
