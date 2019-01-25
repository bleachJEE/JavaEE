package fr.formation.inti.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import fr.formation.inti.servlets.HelloServlet;

/**
 * Servlet Filter implementation class HelloFilter
 */
@WebFilter("/*")
public class RedirectToHelloFilter implements Filter {
	private static final Log log = LogFactory.getLog(RedirectToHelloFilter.class);

    /**
     * Default constructor. 
     */
    public RedirectToHelloFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		log.info("doFilter [RedirectToHelloFilter] ..");
		request.getServletContext().getRequestDispatcher("/HelloServlet").forward(request, response);
		// pass the request along the filter chain
		//chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		log.info("init Filter [RedirectToHelloFilter]  ..");

	}

}
