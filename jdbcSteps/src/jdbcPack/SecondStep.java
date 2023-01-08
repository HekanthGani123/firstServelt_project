package jdbcPack;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class SecondStep {
	public static void main(String[] args) {
		
		Scanner t =new Scanner(System.in);
		System.out.println("Enter a Driver name");
		String d=t.next();
		System.out.println("Enter Url");
		String url=t.next();
		try {
			Class.forName(url);
			System.out.println("Loading and Registering complete");
			DriverManager.getConnection(url);
			System.out.println("Connection created");
		} catch (ClassNotFoundException |SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
