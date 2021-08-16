package org.aetins;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;




/**
 * @author sandeep
 *
 */

@Component
public class AppCORSFilter implements Filter {

	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	public AppCORSFilter() {
		log.info("Cross-Origin Resource Sharing ---> Enabling requests from different origin");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletResponse response = (HttpServletResponse) res;
		HttpServletRequest request = (HttpServletRequest) req;
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, PUT");
		response.setHeader("Access-Control-Max-Age", "3600");
		response.setHeader("Access-Control-Allow-Credentials", "true");
		response.setHeader("Access-Control-Allow-Headers", "Origin, Content-Type, Authorization");
		
		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig filterConfig) {
		log.info("intialize filter");
	}

	@Override
	public void destroy() {
		log.info("destroying filter");
	}

}
