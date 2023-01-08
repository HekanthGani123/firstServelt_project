package jdbcPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Insertion {
	public static void main(String[] args) {
		
		Scanner t= new Scanner(System.in);
		System.out.println("Enter Driver name");
		String d=t.next();
		System.out.println("Enter URl");
		String url=t.next();
		try {
			Class.forName(d);
			System.out.println("Loading and registering complete");
			Connection cn=DriverManager.getConnection(url); 
			System.out.println("connection created");
			
			Statement st=cn.createStatement();//statement platform created
			System.out.println("statement platform created");
			int i=0;
			do {
				System.out.println("Enter id,project name,Inventor name");
				int id=t.nextInt();//23
				String pn=t.next();//
				String inv=t.next();
				String query="insert into jspiders.project value("+id+",'"+pn+"','"+inv+"')";
				st.execute(query);//compliation and execution
				i++;
			}while(i<2);
					
			//("+id+",'"+pn+",'"+inv+"')";	
			System.out.println("data inserted");
			
		}catch(ClassNotFoundException  | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
