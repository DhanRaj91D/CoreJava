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

@WebServlet(loadOnStartup=1,urlPatterns="/Searchbyname")
public class Searchbyname extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		Connection con = Showbooks.makeConnection();
		String bookname = request.getParameter("search");
		try {
			Statement stmt = con.createStatement();
			String sql = "Select * from bookshop where book_name = '" + bookname + "'";
			ResultSet rs = stmt.executeQuery(sql);
			pw.append("<!doctype html>\r\n" + 
					"<html lang=\"en\">\r\n" + 
					"  <head>\r\n" + 
					"    <meta charset=\"utf-8\">\r\n" + 
					"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
					"    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n" + 
					"\r\n" + 
					"    <title>All Books</title>\r\n" + 
					"  </head>\r\n" + 
					"  <body>\r\n" + 
					"\r\n" + 
					"    <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\r\n" + 
					"      <div class=\"container-fluid\">\r\n" + 
					"        <a class=\"navbar-brand\" href=\"#\">Books</a>\r\n" + 
					"        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n" + 
					"          <span class=\"navbar-toggler-icon\"></span>\r\n" + 
					"        </button>\r\n" + 
					"        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n" + 
					"          <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n" + 
					"            <li class=\"nav-item\">\r\n" + 
					"              <a class=\"nav-link active\" aria-current=\"page\" href=\"Home.html\">Home</a>\r\n" + 
					"            </li>\r\n" + 
					"          </ul>\r\n" + 
					"          <form class=\"d-flex\">\r\n" + 
					"            <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n" + 
					"            <li class=\"nav-item\">\r\n" + 
					"              <a class=\"nav-link active\" href=\"AddBook.html\">Add Books</a>\r\n" + 
					"            </li>\r\n" + 
					"          </ul>\r\n" + 
					"          \r\n" + 
					"          </form>\r\n" + 
					"        </div>\r\n" + 
					"      </div>\r\n" + 
					"    </nav>");
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int cost = rs.getInt(3);
				pw.append("<div class=\"col\">\r\n" + 
						"          <div class=\"card\">\r\n" + 
						"            <img src=\"...\" class=\"card-img-top\" alt=\"...\">\r\n" + 
						"            <div class=\"card-body\">\r\n" + 
						"              <h5 class=\"card-title\">"+name+"</h5>\r\n" + 
								"              <p class=\"card-text\">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\r\n" + 
								"            </div>\r\n" + 
								"          </div>\r\n" + 
								"        </div>");
				pw.println("<p>Id: " + id + ", Book Name: " + name + ", cost: " + cost + ".</p>");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		pw.append(" <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\r\n" + 
				"\r\n" + 
				"  \r\n" + 
				"  </body>\r\n" + 
				"</html>");
		pw.close();
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
