package com.servletapi;

import java.io.PrintWriter;

@WebServlet("/Login")
public class Login extends HttpServlet{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	
	String userName = request.getParameter("User");
	String passWord = request.getParameter("pass");
	
	if(passWord.equals("Push20!")) {
		
		RequestDispatcher rd = request.getRequestDispatcher("/HelloWorld.jsp");
		rd.forward(request,response);
	}else {
		RequestDispatcher rd = request.getRequestDispatcher("/Error.jsp");
		rd.forward(request, response);
	}
	
	}

}
