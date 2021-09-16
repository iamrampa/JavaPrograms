package Case;

import java.time.LocalDate;

public class AppEngine {
	
	Student []studentdata;
	Course []courses;
	Enroll []enrollments;
	
	int coursecount=0;
	int studcount=0;
	
	AppEngine()
	{
		studentdata=new Student[5];
		courses =new Course[5];
		enrollments=new Enroll[5];
	}
	
	public void introduce(Course c)
	{
		if(coursecount<5)
		{
			courses[coursecount]=c;
			coursecount++;
			
		}
	}
	 public void register(Student student) 
	 {
		 if(studcount<5)
			{
				studentdata[studcount]=student;
				studcount++;
				
			}
	 }
	 
	 public Student[] listOfStudents() {
		 return this.studentdata;

	    }
	 
	 public Course[] listOfCourses() 
	 {
		return this.courses;
	    }

	 public void enroll(Student[] student, Course[] course,LocalDate t) {
		
		 for(int i=0;i<5;i++)
		 {
			 enrollments[i]=new Enroll();
		 enrollments[i].setStudent(student[i]);
		 enrollments[i].setCourse(course[i]);
		 enrollments[i].setEnrolldate(t);
		 //System.out.println(student[i]);
		 }

	    }
	 public Enroll[] listOfEnrollments() {
		 return this.enrollments;
	    }


}
