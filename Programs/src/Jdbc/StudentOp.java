package Jdbc;

import java.sql.*;
import java.util.*;


public class StudentOp implements Student_Int{
	Connection con;
	PreparedStatement ps;
	public  StudentOp()
	{
		
		try {
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");	
		
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	@Override
	public boolean addStudent(Student st) {
		// TODO Auto-generated method stub
		boolean res=false;
		try
		{
		ps=con.prepareStatement("insert into project values(?,?,?)");
		ps.setInt(1, st.getId());
		ps.setString(2, st.getName());
		ps.setString(3, st.getCity());
		int count=ps.executeUpdate();
		if(count>0)
			res=true;
		
		}
		catch(SQLException e)
		{
		System.out.println(e.getMessage());
		}
		return res;
		
		
	}
	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		List<Student> l1=new ArrayList<Student>();
		try
		{
			Student s1;
		
		ps=con.prepareStatement("select * from project");
		ResultSet r1=ps.executeQuery();
		while(r1.next())
		{
			s1=new Student(r1.getInt(1),r1.getString(2),r1.getString(3));
			l1.add(s1);
		}
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		
		return l1;
	}
	@Override
	public void doUpdate(Student st) {
		// TODO Auto-generated method stub
		try
		{
		ps=con.prepareStatement("update project set name=?,city=? where id=?");
		ps.setString(1, st.getName());
		ps.setString(2,st.getCity());
		ps.setInt(3, st.getId());
		ps.executeUpdate();
		System.out.println("updated");
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	@Override
	public Student doSearch(int sid) {
		// TODO Auto-generated method stub
		Student st=null;
		try
		{
		ps=con.prepareStatement("select * from project where id=?");
		ps.setInt(1, sid);
		ResultSet rs=ps.executeQuery();
		if(rs.next())
			st=new Student(rs.getInt(1),rs.getString(2),rs.getString(3));
		
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		
		return st;
	}
	@Override
	public void deleteStudent(int sid) {
		// TODO Auto-generated method stub
		try
		{
		ps=con.prepareStatement("delete from project where id=?");
		ps.setInt(1, sid);
		ps.executeUpdate();
		System.out.println("deleted");
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
}

