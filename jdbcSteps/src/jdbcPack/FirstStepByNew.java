package jdbcPack;//Tight Coupling---------new Keyword Way

import java.sql.DriverManager;
import java.sql.SQLException;

public class FirstStepByNew {
	public static void main(String[] args) {
		
		try {
			java.sql.Driver t=new com.mysql.cj.jdbc.Driver();
			System.out.println("loading complete");
			DriverManager.registerDriver(t);
			System.out.println("Registeration Complete");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
