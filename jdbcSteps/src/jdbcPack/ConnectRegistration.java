package jdbcPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ConnectRegistration {
	public static void main(String[] args) {
		
		try (Scanner in = new Scanner(System.in)) {
			Connection cn=null;
			PreparedStatement pst=null;
			//ResultSet rs=null;
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				 cn=DriverManager.getConnection("jdbc:mysql://localhost:3306?useSSL=false","root","tiger");
				 pst=cn.prepareStatement("insert into jspiders.registration values(?,?,?,?,?)");
				 
				 System.out.println("Enter the Name,Mobile,email,password and city for registration");
				 String name=in.next();
				 long mobile=in.nextLong();
				 String email=in.next();
				 String pass=in.next();
				 String city=in.next();
				// int name=in.next();
				 
				 pst.setString(1, name);
				 pst.setLong(2,mobile);
				 pst.setString(3,email);
				 pst.setString(4, pass);
				 pst.setString(5, city);
				 
				// pst.setInt(1,id);
				 pst.executeUpdate();
				 System.out.println("data inserted");
				 
			}catch(ClassNotFoundException | SQLException e) {
			          e.printStackTrace();
		         }
			finally {
				try {
					//if(rs!=null) 
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
}
