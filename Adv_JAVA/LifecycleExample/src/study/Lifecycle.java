package study;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Lifecycle")
public class Lifecycle extends HttpServlet {
	
    public Lifecycle() {
       System.out.println("parameterless constructer called");
    }
    
    @Override
    public void init() throws ServletException {
    	System.out.println("Init method called");
    }

    @Override
    protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
    	System.out.println("Service called");
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("Doget called");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("dopost called");
	}
	
	@Override
	public void destroy() {
		System.out.println("Destroy  get called");
	}

}
