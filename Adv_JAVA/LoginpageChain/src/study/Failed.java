package study;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Failed")
public class Failed extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		String Failed = (String) request.getAttribute("line2");
//
//		String poemmore = Failed + "up above the";

		String wrongpass ="You are not allowed!!" + " You are in Failed Servlate";
		response.setContentType("text/html");
		response.getWriter().append(wrongpass);

	}

}
