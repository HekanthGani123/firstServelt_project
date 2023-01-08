package jdbcPack;

import java.util.Scanner;

public class FirstStepRecommended {
	public static void main(String[] args) {
		
		Scanner t =new Scanner(System.in);
		System.out.println("Enter a Driver name");
		String d=t.next();
		try {
			Class.forName(d);
			System.out.println("loading and registering complete");//single step 2connection complete
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
