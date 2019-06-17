package com.servletapi;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.jdbc.Connection;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		doGet(request, response);
		
		String cust_username = request.getParameter("cust_username");
		String cust_password = request.getParameter("cust_password");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8889/bank_db", "root", "root");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select cust_username, cust_password from customers where cust_username = " + cust_username + "and cust_password = " + cust_password + ".");
			
			if(rs.next()) {
				HttpSession session = request.getSession();
				session.setAttribute("cust_username", cust_username);
				response.sendRedirect("http://localhost:8080/WebProj/Welcome.jsp?name="+rs.getString("cust_username"));
			}else {
				out.println(" Invalid username or password!");
			}
		}catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
