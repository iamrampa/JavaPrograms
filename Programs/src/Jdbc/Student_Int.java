package Jdbc;

import java.util.*;

public interface Student_Int
{
	public boolean addStudent(Student st);
	public List<Student> getStudents();
	public void doUpdate(Student st);
	public Student doSearch(int sid);
	public void deleteStudent(int sid);
}