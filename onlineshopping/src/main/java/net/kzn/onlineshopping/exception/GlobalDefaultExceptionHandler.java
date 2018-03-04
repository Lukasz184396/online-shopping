package net.kzn.onlineshopping.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {

	//This handle http://localhost:8080/onlineshopping/xxxxxsomethingNotMaped
	@ExceptionHandler(NoHandlerFoundException.class)
	public ModelAndView handlerNoHandlerFoundException() {
		
		ModelAndView mv = new ModelAndView("error");
		
		mv.addObject("errorTitle", "The page is not constructed!");
		
		mv.addObject("errorDescription", "The page you are looking for is not available now!");
		
		mv.addObject("title", "404 Error Page");
		
		return mv;
	}
	
	//This handle http://localhost:8080/onlineshopping/show/10000000000000/product
	@ExceptionHandler(ProductNotFoundException.class)
	public ModelAndView handlerProductNotFoundException() {
		
		ModelAndView mv = new ModelAndView("error");
		
		mv.addObject("errorTitle", "Product NOT available now!");
		
		mv.addObject("errorDescription", "The PRODUCT you are looking for is NOT available now!");
		
		mv.addObject("title", "Product Unavailable");
		
		return mv;
	}
	
	//This handle http://localhost:8080/onlineshopping/show/1abcxxxx/product
	@ExceptionHandler(Exception.class)
	public ModelAndView handlerException(Exception ex) {
		
		ModelAndView mv = new ModelAndView("error");
		
		mv.addObject("errorTitle", "Contact with admin");
				
				// only for debugging your application 
/*				StringWriter sw = new StringWriter();
				PrintWriter pw = new PrintWriter(sw);
				
				ex.printStackTrace(pw);
				mv.addObject("errorDescription", sw.toString());*/
		
		mv.addObject("errorDescription", ex.toString());
		
		mv.addObject("title", "ERROR");
		
		return mv;
	}
}