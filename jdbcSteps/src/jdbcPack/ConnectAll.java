package jdbcPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ConnectAll {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	PreparedStatement pt=null;
	Connection cn=null;
	ResultSet rs=null;


	System.out.println("Enter 1 insert Data");
	System.out.println("Enter 2 update Data");
	System.out.println("Enter 3 delete Data");
	System.out.println("Enter 4 fetch all Data");
	int i=sc.nextInt();
	
	
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	cn =DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&&password=tiger&&useSSL=false");

	//insert

	if(i==1) {
	System.out.println("Insert Data");
	pt=cn.prepareStatement("insert into jspiders.registration1 values(?,?,?,?,?)");
	System.out.println("enter name,mobile,email,password,city");

	String name=sc.next();
	long mobile=sc.nextLong();
	String email=sc.next();
	String password=sc.next();
	String city=sc.next();


	pt.setString(1,name);
	pt.setLong(2,mobile);
	pt.setString(3,email);
	pt.setString(4,password);
	pt.setString(5,city);

	pt.executeUpdate();

	System.out.println("data save into database");
	}
	//update
	else if(i==2) {
	System.out.println("update data");
	pt=cn.prepareStatement("update jspiders.registration1 set city=? where email=?");

	sc.nextLine();
	System.out.println("enter city,primary key email");

	String city=sc.next();
	sc.nextLine();
	String email=sc.nextLine();

	pt.setString(1,city);
	pt.setString(2,email);

	pt.executeUpdate();
	System.out.println("data is update");

	}
	//delete
	else if(i==3) {
	System.out.println("Delete Data");
	pt=cn.prepareStatement("delete from jspiders.registration1 where email=?");
	sc.nextLine();
	System.out.println("Enter email= ");
	String email=sc.next();


	pt.setString(1,email);
	pt.executeUpdate();
	System.out.println("data is deleted");
	}
	//all data
	else if(i==4) {
	System.out.println("Show data");
	pt=cn.prepareStatement("select * from jspiders.registration1");

	// System.out.println("Enter email=");
	// String email=sc.next();
	//
	// pt.setString(1,email);
	rs = pt.executeQuery();


	System.out.println("name"+"   \t    "+"mobile"+"    \t  "+"email"+"     \t    "+"password"+" \t   "+"citiy");
	System.out.println("--------------------------------------------------------------------------------------");
	while(rs.next()) {
	System.out.println(rs.getString("name")+"     "+rs.getLong("mobile")+"      "+rs.getString("email")+"      "+rs.getString("password")+"      "+rs.getString("city"));

	}
	}

	else {
	System.out.println("Thank you");
	}

	} catch (ClassNotFoundException | SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	finally {
	if(sc!=null ||pt!=null ||cn!=null ||rs!=null ) {
	try {
	sc.close();
	pt.close();
	} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	}
	}

}
}
