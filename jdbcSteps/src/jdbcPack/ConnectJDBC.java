package jdbcPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectJDBC {
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a Driver name");
		String driver=in.next();
		System.out.println("Enter a URL");
		String url=in.next();
		try {
			Class.forName(driver);
			System.out.println("loading and registering");
			Connection cn=DriverManager.getConnection(url);
			System.out.println("Connection created");
			Statement st=cn.createStatement();
			System.out.println("Platform created");
			int i=1;
			do {
			System.out.println("student id::name::age::gender::email::branch");
			String id=in.next();
			String name=in.next();
			String age=in.next();
			String gender=in.next();
			String email=in.next();
			String branch=in.next();
			
			String query="Insert into jspiders.student value("+id+" ,'"+name+"',"+age+",'"+gender+"','"+email+"','"+branch+"')";
			st.execute(query);
			//i++;
			System.out.println("data inserted");
			System.out.println("press 1 to insert data......Or Press any key to Exit");
			System.out.println("Thank You");
			}while(i==1);
		} catch (ClassNotFoundException |SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
