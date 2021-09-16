package Case;

import java.util.*;

public class Managestudents
{

    List<Student> obj=new ArrayList<Student>();

    void addStudents(Student stu)
    {
        this.obj.add(stu);
    }
    List<Student> getStudents()
    {
        return this.obj;
    }
    
    /*void modify(Student stu)
    {
    	this.obj.set()
    }*/
    
    void delete(Managestudents stu,int id)
    {
    	for(Student st: stu.getStudents() )
    	{
    		if(st.getId()==id)
    			{
    			this.obj.remove(st);
    			}
    		break;
    		
    	}
    	
    	
    }
    Student search(int id,Managestudents ms)
    {
    	 
    	for(Student stu: ms.getStudents() )
    	{
    		if(stu.getId()==id)
    			return stu;
    		
    	}
    	return null;
    	
    }
    
    void modify(int id,Managestudents ms)
    {
    	Scanner sc=new Scanner(System.in);
    	for(Student stu: ms.getStudents() )
    	{
    		if(stu.getId()==id)
    		{
    			System.out.println("enter new details name dob phone nos");
    			stu.setId(sc.nextInt());
    			stu.setName(sc.next());
    			stu.setDob(sc.next());
    			String[] ph=new String[2];
    			ph[0]=sc.next();
    			ph[1]=sc.next();
    			stu.setPhone(ph);
    			break;
    		}
    		
    	}
    }
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    Managestudents st=new Managestudents();
    do
    {
        System.out.println("1.Add Student 2.Display Student 3.search 4. delete  5. modify");
        System.out.print("Your Choice:");
        int choice=sc.nextInt();
        switch (choice) {
        case 1:
            System.out.println("Enter id,Name,dob and phone nos");
            Student stud=new Student();
            stud.setId(sc.nextInt());
            stud.setName(sc.next());
            stud.setDob(sc.next());
            String[] phone=new String[2];
            phone[0]=sc.next();
            phone[1]=sc.next();
            stud.setPhone(phone);
            st.addStudents(stud);
            System.out.println("Student added");
            break;
        case 2:
            System.out.println("Student Details******");
            for(Student s1 : st.getStudents())
            {
                System.out.println(s1);
            }
            break;
        case 3:
        	System.out.println("write the id");
            Student s3=new Student();
            s3=st.search(sc.nextInt(),st);
            System.out.println(s3);
            break;
        case 4:
        	System.out.println("write the id");
        	st.delete(st, sc.nextInt());
        	break;
        	
        case 5:
        	System.out.println("write the id");
        	st.modify(sc.nextInt(),st);
        	break;
        default:
            System.out.println("Invalid Choice..");
            break;
        }

    }while(true);


}
}