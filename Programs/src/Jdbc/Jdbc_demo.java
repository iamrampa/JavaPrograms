package Jdbc;
import java.sql.*;
public class Jdbc_demo {
public static void main(String[] args) {
	
	Connection con=null;
	
	try {
		/*Driver driver =new oracle.jdbc.driver.OracleDriver();
		DriverManager.registerDriver(driver);*///alternate way
		Class.forName("oracle.jdbc.driver.OracleDriver");//do this
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
	    Statement stmt=con.createStatement();
	    ResultSet rs=stmt.executeQuery("select * from employees");
	    while(rs.next())
	    {
	    	System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
	    }
	}
	catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally
	{
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}//////see it important
/* DatabaseMetaData dt=con.getMetaData();
                System.out.println(dt.getURL());
                System.out.println(dt.getUserName());

                Statement stmt=con.createStatement(); // ForSQL Queries.
                ResultSet rs=stmt.executeQuery("select * from Employee"); //Executing Qry and storing result

                ResultSetMetaData rsm=rs.getMetaData();
                System.out.println(rsm.getColumnCount());
                System.out.println(rsm.getColumnLabel(1));
                System.out.println(rsm.getColumnTypeName(1));
                System.out.println(rsm.getColumnDisplaySize(1));*/
