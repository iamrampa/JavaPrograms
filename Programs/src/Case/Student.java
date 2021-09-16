package Case;

import java.util.Arrays;

public class Student {

	private int id;
	private String name;
	private String dob;
	static String College_name="vasavi";
	private String[] phone=new String[2];
	
	public String[] getPhone() {
		return phone;
	}

	public void setPhone(String[] phone) {
		this.phone[0] =phone[0];
		this.phone[1]=phone[1];
	}

	Student()
	{
    super();
    }
	
	Student(int id,String name,String dob)
	{
		this.id=id;
		this.name=name;
		this.dob=dob;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public static String getCollege_name() {
		return College_name;
	}

	public static void setCollege_name(String college_name) {
		College_name = college_name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dob=" + dob + ", phone=" + Arrays.toString(phone) +",collegename="+Student.College_name+ "]";
	}
	
	


	
	
	
	
}
