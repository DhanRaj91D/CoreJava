package study.entity;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add_product")
public class addProduct extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		int product_id = Integer.parseInt(request.getParameter("id"));
		String product_name = request.getParameter("name");
		String product_desc = request.getParameter("desc");
		int unit = Integer.parseInt(request.getParameter("unit"));
		String expiry_date = request.getParameter("date");
		int cost = Integer.parseInt(request.getParameter("cost"));
		ProductDAO pd = new ProductDAO();

		if(pd.addNewProduct(product_id, product_name, product_desc, unit, cost, expiry_date))
		{
			response.getWriter().append("Product Added Succsesfully");
		}
		else {
			response.getWriter().append("Error.... product not added");
		}

	}

}
