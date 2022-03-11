package study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.entity.groceryEntity;




/*As I showed all details in jsp file so im not using this servate */





@WebServlet("/show_user")
public class show_user extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		ProductDAO pd = new ProductDAO();
		groceryEntity ge = pd.showDetails(id);

		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		pw.append("<h1>Product Details</h1><table border=\"1\">\r\n" + "<tr><th>product_id</th><th>cost</th><th>Expiry_Date</th>"
				+ "<th>product_desc</th><th>product_name</th><th>Quantity</th></tr>");
		pw.append("<tr><td>" + ge.getProduct_id() + "</td><td>" + ge.getCost() + "</td><td>" + ge.getExpiry_date()
				+ "</td><td>" + ge.getProduct_desc() + "</td><td>" + ge.getProduct_name() + "</td><td>" + ge.getUnit()
				+ "</td></tr></table>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
