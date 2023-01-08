package jdbcPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Fetching {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&&password=tiger&&useSSL=false");
			
			Statement st=cn.createStatement();
			Scanner in =new Scanner(System.in);
			System.out.println("Enter a ID");
			int id=in.nextInt();
			
			String query="Select * from jspiders.project";//Fetching all records from table
			String query="Select * from jspiders.project where id="+id;//fetching record by ID
//			String query="delete from jspiders.project where id="+id;
			st.execute(query);
//			System.out.println("one row deleted");
			System.out.println("Id\t"+"projectName\t"+"InventorName\t");
			System.out.println("-----------------------------------------");
			while(rs.next()) {// if condn fetch only one record
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			}
		}catch (ClassNotFoundException |SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		
	}

}
}
