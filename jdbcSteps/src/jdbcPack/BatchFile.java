package jdbcPack;

import java.sql.*;
import java.util.Scanner;

public class BatchFile {
	public static void main(String[] args) {
		
		Scanner t=new Scanner(System.in);
		Connection cn=null;
		PreparedStatement pst=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&&password=tiger&&useSSL=false");
			pst=cn.prepareStatement("insert into jspiders.jstudent values(?,?,?,?)");
			int r=0;
			do {
				System.out.println("enter id,name,marks,city");
				
				pst.setInt(1, t.nextInt());
				pst.setString(2, t.next());
				pst.setDouble(3, t.nextDouble());
				pst.setString(4, t.next());
				
				pst.addBatch();
				System.out.println("data inserted");
				System.out.println("press 1 to again..or press any key ");
				r=t.nextInt();
				
				
			}
			while(r==1);
			
			int[] arr=pst.executeBatch();
			
			for(int x:arr) {
				System.out.println(x);
			}
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			
			if(pst!=null) {
			try {
				pst.close();
				cn.close();
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
			
		}

		}
		
		
	}}


