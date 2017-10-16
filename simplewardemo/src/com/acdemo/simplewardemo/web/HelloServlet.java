package com.acdemo.simplewardemo.web;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("<H1>Hello World Servlet</H1>");
		
		response.getWriter().append("<H2>It is nice of you to drop by...</H2>");
//		response.getWriter().append("<H3>to show that it can work</H3>");
//		response.getWriter().append("<H4>Are you happy now?</H4>");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = request.getParameter("nameField");
		
		if (name.equals(""))
		{
			name="Incognito";
		}
		
		String yob = request.getParameter("yearOfBirthField");
		Calendar cal = Calendar.getInstance();
		int currYear = cal.get(Calendar.YEAR);
		int age = currYear - Integer.valueOf(yob);
		
		response.getWriter().append("<h1>Hello there "+name+"!</h1>");
		response.getWriter().append("<h1>Based on your year of birth, you are "+age+" years old</h1>");

		// added code to add more functionality here
		// more comments: More interactions added to the application.
		
		String origin = request.getParameter("originCountryField");
		if (origin != null) {
			response.getWriter().append("<h1>Welcome to Australia. I hope you find it nicer here than " + origin + "</h1>");
		} else {
			response.getWriter().append("<form method=\"POST\" action=\"HelloServlet\">");

			response.getWriter().append("<input type=\"hidden\" name=\"nameField\" value=\"" + name + ("\" /><br>"));
			response.getWriter().append("<input type=\"hidden\" name=\"yearOfBirthField\" value=\"" + yob + ("\" /><br>"));
			
			response.getWriter().append("Where do you hail from? ");
			response.getWriter().append("<input type=\"text\" name=\"originCountryField\" maxLength=30 /><br><br>");
			
			response.getWriter().append("<input type=submit name=submitBtn />");
			response.getWriter().append("</form>");
			
		}
		
		doGet(request, response);
	}

}
