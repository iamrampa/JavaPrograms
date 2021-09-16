package Case;

import java.time.LocalDate;
import java.util.Scanner;



public class Info {

	public void display(Student s1)
	{
		
		System.out.println(s1);
	}
	public void display(Course c1)
	{
		
		System.out.println(c1);
	}
	
	
	public void Scenario()
	{
		Student s2=new Student(1,"abhi","13-04-1973");
		Student s1=new Student(57,"Rampa","30-10-1999");
		String[] phone1= {"234543","4565434"};
		s1.setPhone(phone1);
		s2.setPhone(phone1);
		
		
		
		 Info e1=new Info();
		 e1.display(s2);
		 e1.display(s1);
	}
	
	public void Scenario2()
	{
		Student[] st=new Student[2];
		Info e1=new Info();
		String[] phone1= {"234543","4565434"};
		
			st[0]=new Student(57,"ram","20-10-1999");
			st[1]=new Student(56,"sam","20-11-1999");
			st[0].setPhone(phone1);
			st[1].setPhone(phone1);
		for(int i=0;i<2;i++)
			e1.display(st[i]);
	}
	
	public void scenario3()
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of students");
		int numb=scan.nextInt();
		Student st2[]=new Student[numb];
		int id;
		String name;
		String dob;
		String[] phone=new String[2];
		for(int i=0;i<numb;i++)
		{
			id=scan.nextInt();
			name=scan.next();
			dob=scan.next();
			for(int j=0;j<2;j++)
				phone[j]=scan.next();
			
			st2[i]=new Student(id,name,dob);
			st2[i].setPhone(phone);
		}
		
		Info e3=new Info();
		for(int i=0;i<numb;i++)
			e3.display(st2[i]);
		
		
		scan.close();
		
	}
	public void scenario4()
	{
	Course c1=new Course(21,"cse",2,2000.3);
	Info e1=new Info();
	e1.display(c1);
	}
	
	public void scenario5()
	{
		LocalDate date= LocalDate.now();
		String[] phone1= {"234543","4565434"};
		Student[] s1 =new Student[5];
		for(int i=0;i<5;i++)
		{
			s1[i]=new Student(1,"rampa","30-10-1999");
		
		s1[i].setPhone(phone1);
		}
		/*Student s2=new Student(1,"rampa","30-10-1999");
		s2.setPhone(phone1);
		Student s3=new Student(1,"rampa","30-10-1999");
		s3.setPhone(phone1);
		Student s4=new Student(1,"rampa","30-10-1999");
		s4.setPhone(phone1);
		Student s5=new Student(1,"rampa","30-10-1999");
		s5.setPhone(phone1);*/
		Course[] c1=new Course[5];
		for(int i=0;i<5;i++)
		 c1[i]=new Course(21,"cse",2,2000.3);
		/*Course c2=new Course(21,"cse",2,2000.3);
		Course c3=new Course(21,"cse",2,2000.3);
		Course c4=new Course(21,"cse",2,2000.3);
		Course c5=new Course(21,"cse",2,2000.3);*/
		AppEngine a1=new AppEngine();
		for(int i=0;i<5;i++)
		{
		a1.introduce(c1[i]);
		/*a1.introduce(c2);
		a1.introduce(c3);
		a1.introduce(c4);
		a1.introduce(c5);*/
		a1.register(s1[i]);
		}
		/*a1.register(s2);
		a1.register(s3);
		a1.register(s4);
		a1.register(s5);*/
		
		a1.enroll(s1,c1,date);
		/*a1.enroll(s2,c2,date);
		a1.enroll(s3,c3,date);
		a1.enroll(s4,c4,date);
		a1.enroll(s5,c5,date);*/
		Enroll[] e1=new Enroll[5];
        e1=a1.listOfEnrollments();
        for(int i=0;i<5;i++)
        System.out.println(e1[i]);
        
		
		
	}
	
	
}
