import java.lang.*;
public class Start
{
	public static void main(String []args)
	{
		System.out.println("Testing....");
		Student s1 = new Student();
		s1.setName("Steve");
		s1.setID(101);
		s1.setCgpa(3.75);
		System.out.println("s1.name: "+s1.getName());
		System.out.println("s1.id: "+s1.getID());
		System.out.println("s1.cgpa: "+s1.getCgpa());
		s1.checkScholarship();
		
		Student s2 = new Student("Peter", 102, 3.88);
		s2.display();
		s2.checkScholarship();
		System.out.println("Total Students: "+Student.getCount());
		
		Teacher t1 = new Teacher();
		t1.setName("Tony");
		t1.setID(501);
		t1.setSalary(5000);
		System.out.println("t1.name: "+t1.getName());
		System.out.println("t1.id: "+t1.getID());
		System.out.println("t1.salary: "+t1.getSalary());
		t1.yearlySalary();
		t1.yearlySalaryWithBonus();
	
		
		Teacher t2 = new Teacher("Smith", 502, 6000);
		t2.display();
		t2.yearlySalary();
		t2.yearlySalaryWithBonus();
		
		System.out.println("Total Teachers: "+Teacher.getCount());
		
		
	}
	static
	{
		System.out.println("Inside Start class");
	}
}