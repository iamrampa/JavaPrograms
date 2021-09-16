package Jdbc;
import java.sql.*;
public class CallProc 
{
		public static void main(String[] args) 
		{
			Connection con = null;
			try {
				
				Driver driver=new oracle.jdbc.driver.OracleDriver();
				DriverManager.registerDriver(driver);
				
				con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");//Connecting..
				CallableStatement cs=con.prepareCall("{ call updateSal(?,?) }");
				cs.setInt(1, 57);
				cs.setString(2,"ramp");
				cs.execute();
				
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
				finally {
					try {
						con.close();
					} catch (SQLException e) {
	
						e.printStackTrace();
					}
				}
		}
}


