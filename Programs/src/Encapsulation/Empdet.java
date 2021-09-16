package Encapsulation;

public class Empdet {
	
	 void addEmployee()
	 {
		 Employee e1=new Employee();
		 e1.setEmpno(57);
		 e1.setName("ram");
		 e1.setCity("hyderabad");
		 e1.setSalary(100000);
		 display(e1);
	 }

	 
	 
	 void display(Employee E)
	 {
		 System.out.println(E);
		/* System.out.println("the empno is " + E.getEmpno() );
		 System.out.println("the name is" + E.getName());
		 System.out.println("the city is" +E.getCity());
		 System.out.println("the salary is"+E.getSalary());*/
	 }
}
