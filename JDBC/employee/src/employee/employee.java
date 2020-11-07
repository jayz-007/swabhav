package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class employee {
	Scanner sc = new Scanner(System.in);
	System.out.println(("Eneter no"));
	String empNo = sc.nextLine();
	Connection connection = null;
	try {
		
		
		connection = DriverManager.getConnection("jdbc:mysql://localhost:4040/swabhav?user=root&password=root");
		
		java.sql.PreparedStatement stmt = connection.prepareStatement("Select *from emp where EMPNO  = ?");
		stmt.setString(1, empNo);
		
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getDate(5)+" "+rs.getInt(6)+" "+rs.getInt(7)+" "+rs.getInt(8)  );
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	finally {
		connection.close();
	}
}
