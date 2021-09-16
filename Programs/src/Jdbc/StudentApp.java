package Jdbc;

import java.util.ArrayList;
import java.util.List;

public class StudentApp {
	
	public static void main(String[] args) {
		
		Student s1=new Student(45,"Saket","mumbai");
		Student_Int so1=new  StudentOp();
		boolean res=so1.addStudent(s1);
		if(res)
			System.out.println("student inserted");
		else
			System.out.println("failed");
	
	/*so1.doUpdate(s1);
		List<Student> l1=so1.getStudents();
		System.out.println(l1);
		
		Student s2=so1.doSearch(57);
		System.out.println(s2);
		so1.deleteStudent(47);*/
		List<Student> l1=so1.getStudents();
		System.out.println(l1);
		
		
	}

}
