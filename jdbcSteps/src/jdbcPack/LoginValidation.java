package jdbcPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LoginValidation {
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		Connection cn=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			 cn=DriverManager.getConnection("jdbc:mysql://localhost:3306?useSSL=false","root","tiger");
			 pst=cn.prepareStatement("insert into jspiders.registration where email=?");
			 
			 System.out.println("Enter a mail");
			 String email=in.next();
			 
			 System.out.println("Enter a Password");
			 String password=in.next();
			 
			 pst.setString(1, email);
			 rs=pst.executeQuery();
			 
			 
			 
			 if(rs.next()) {
				 String dbpass=rs.getString("Password");
				 if(dbpass.equals(password)) {
					 System.out.println("Welcome");
				 }else {
					 System.out.println("plz check password");
					 
				 }
			 }else {
				 System.out.println("plz do signup to log in");
			 }
		}catch(ClassNotFoundException | SQLException e) {
	          e.printStackTrace();
       }
	finally {
		try {
			if(pst!=null) 
			{
				//rs.close();
				pst.close();
				cn.close();
			}
		
	}catch(SQLException e) {
	}
			 }
		
		
		
	}
	}


