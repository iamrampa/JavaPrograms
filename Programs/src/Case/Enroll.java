package Case;

import java.time.LocalDate;

public class Enroll {
	private Student student;
	private Course course;
	private LocalDate enrolldate;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public LocalDate getEnrolldate() {
		return enrolldate;
	}
	public void setEnrolldate(LocalDate enrolldate) {
		this.enrolldate = enrolldate;
	}
	@Override
	public String toString() {
		return "Enroll [student=" + student + ", course=" + course + ", enrolldate=" + enrolldate + "]";
	}
	
	

}
