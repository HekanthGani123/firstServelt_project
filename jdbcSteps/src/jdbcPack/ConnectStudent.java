package jdbcPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ConnectStudent {
	public static void main(String[] args) {
		
	Scanner in=new Scanner(System.in);
		Connection cn=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			 cn=DriverManager.getConnection("jdbc:mysql://localhost:3306?useSSL=false","root","tiger");
			 pst=cn.prepareStatement("select * from jspiders.jstudent where id=?");
			 
			 System.out.println("Enter the id of the student");
			 int id=in.nextInt();
			 pst.setInt(1,id);
			 rs=pst.executeQuery();
			 if(rs.next()) {
				 System.out.println("Student id="+rs.getInt("id")+"\n Name="+rs.getString("name")+"\n Marks= "+rs.getDouble(3)+"\n City= "+rs.getString(4));
			 }else {
				 System.out.println("Entered  with id="+id+" is not present");
				 
	       }
		}catch(ClassNotFoundException | SQLException e) {
		          e.printStackTrace();
	         }
		finally {
			try {
				if(rs!=null) 
				{
					rs.close();
					pst.close();
					cn.close();
				}
			
		}catch(SQLException e) {
		}
		
}
}
}
//wap to do  sign up program 

//welcome
//1.insert--->enter id,name----data inserted
//2.update
//3.delete
//4.display all---all, students data should be displayed
			
		
		
		
			


