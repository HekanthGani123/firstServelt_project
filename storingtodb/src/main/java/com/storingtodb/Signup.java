package com.storingtodb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(value="/sign")
public class Signup extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String email = req.getParameter("em");
		String pass = req.getParameter("pass");
		String mob = req.getParameter("mob");
		
		Connection cn=null;
		PreparedStatement pst=null;
		
		PrintWriter writer = resp.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn=DriverManager.getConnection("jdbc:mysql://localhost:3306?useSSL=false", "root", "tiger");
			
			pst=cn.prepareStatement("insert into signupdetails.register values(?,?,?,?)");
			
			pst.setString(1,name);
			pst.setString(2,email);
			pst.setString(3,pass);
			pst.setLong(4,Long.parseLong(mob));
			
			pst.executeUpdate();
			
			writer.println("<h1>Registeration Succefully</h1>");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
