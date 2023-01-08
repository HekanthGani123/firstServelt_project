package com.astrology;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FutureTell implements Servlet{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
	       String value=req.getParameter("na");
	       
	       String[] arr= {
	    		   "i will play Cricket",
	    		   "i will play volleyball",
	    		   "i will play KHo-KHo",
	    		   "i will play rummy"
	       };
	       
	       Random rand = new Random();
	       int n=rand.nextInt(arr.length);
	       
	       PrintWriter val = resp.getWriter();
	       val.println("<h1>Welcome "+value+"</h1>");
	       val.println("<h1>My Games---"+arr[n]+"</h1>");
		
	}

}
