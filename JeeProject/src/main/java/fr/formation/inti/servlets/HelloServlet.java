package fr.formation.inti.servlets;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Log log = LogFactory.getLog(HelloServlet.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HelloServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		log.info("init  ..");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		log.info("destroy ..");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
//	protected void service(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		log.info("Service ..");
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		log.info("doGet ..");
//		response.getWriter().append("Served at: ").append(request.getContextPath());

		ServletOutputStream out = response.getOutputStream();

		out.println("<html>");
		out.println("<head><title>Hello Servlet</title></head>");
		out.println("<body>");
		out.println("<h3>Hello World</h3>");
		out.println("This is my first Servlet");
		out.println("</body>");
		out.println("<html>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		log.info("doPost ..");
		doGet(request, response);
	}

}
