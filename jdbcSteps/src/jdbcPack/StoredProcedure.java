package jdbcPack;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;


public class StoredProcedure {
	public static void main(String[] args) {
		
        Scanner in=new Scanner(System.in);
        
		Connection cn=null;
		CallableStatement cst=null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		cn=DriverManager.getConnection("jdbc:mysql://localhost:3306?useSSL=false","root","tiger");
		
		cst=cn.prepareCall("call jspiders.inserting(?,?,?,?)");
		System.out.println("Enter id,name,marks,& city");
		cst.setInt(1,in.nextInt());
		cst.setString(2, in.next());
		cst.setDouble(3, in.nextDouble());
		cst.setString(4, in.next());
		
		
		cst.executeUpdate();
		System.out.println("data inserted");
	}catch (ClassNotFoundException | SQLException e) {
		
		e.printStackTrace();
	}
		finally {
		
				if(cst!=null) {
		         try {
					cst.close();
					cn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		         
				}
			
		}
		
		
	}
	
	
	
	
	
	

}
