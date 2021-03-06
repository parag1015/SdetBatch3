package com.fannie;

import java.io.IOException;
import java.io.PrintWriter;import java.nio.charset.UnmappableCharacterException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginValidate
 */
@WebServlet("/validate")
public class LoginValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uName = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		// this shall be connected to DB to check the 
		// validation 
		if(uName.equals("fannie") && pass.equals("test")){
			// success 
			request.getRequestDispatcher("Sucess").forward(request, response);
		}else{
			// failure 
			out.print("<h2> Sorry Invalid Credentials </h2>");
			request.getRequestDispatcher("login.html").
				include(request, response);
		}
	}

}
