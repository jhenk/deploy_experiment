

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.net.InetAddress;

@WebServlet("/")
public class doit extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public doit() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("String printed by doit");
    	InetAddress inetAddress = InetAddress.getLocalHost();
    	
    	pw.println("<br>");
    	pw.println("My hostname is : " + inetAddress.getHostName());
    	pw.println("<br>");
        pw.println("My IP address is  : " + inetAddress);

		pw.println("<label for='cars'>Choose a car:</label>");
		pw.println("<select name='cars' id='cars'>");
		pw.println("	<option value='volvo'>Volvo</option>");
		pw.println("	<option value='saab'>Saab</option>");
		pw.println("	<option value='mercedes'>Mercedes</option>");
		pw.println("	<option value='audi'>Audi</option>");
		pw.println("</select>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
