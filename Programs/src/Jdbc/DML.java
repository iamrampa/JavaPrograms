package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DML {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con;
		Class.forName("oracle.jdbc.driver.OracleDriver");//do this
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the details");
		int sid=sc.nextInt();
		String name=sc.next();
		String city=sc.next();
	    PreparedStatement p1=con.prepareStatement("insert into jdbc values(?,?,?)");
	    p1.setInt(1, sid);
	    p1.setString(2, name);
	    p1.setString(3, city);
	    p1.executeUpdate();
	    System.out.println("Student updated");

	}

}
