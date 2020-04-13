package sds;
import java.io.*; 
import java.util.*; 
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	RController C=new RController();
	Account Cd=new Account();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response, int id) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String requestType=request.getParameter("requestType");
		
		switch(requestType) {
		  case "ViewRest":
				ArrayList<Restaurant> RK=RController.getRList();
				request.setAttribute("Rlist", RK);
		    break;
		    
		  case "login":
			  String type = request.getParameter("AccountType");
			  String user = request.getParameter("username");
			  String password = request.getParameter("pswd");
			  
			  if (Cd.verifyuser(user, password)) {
			  if (type=="admin") {response.sendRedirect("AdminHome.html");}  //only one admin so no need to do anything else
			  else if (type=="chef") {}
			  else if (type=="customer") {}
			  else if (type=="manager") {}
			  else response.sendRedirect("error.html");}
			
		    break;
		    
		  default:
		    // code block
		}
		
		
	}

}
