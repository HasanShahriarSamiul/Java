import java.lang.*;
public class Start
{
	public static void main(String[] args)
	{
		System.out.println("No time to eat!");
		Student s1 = new Student();
		s1.setName("Bruce");
		s1.setAge(20);
		s1.setCgpa(3.5);
		s1.display();
		
		Teacher t1 = new Teacher("Steve", 31, 5000);
		t1.display();
		t1.yearlySalary();
		
	}
	static
	{
		System.out.println("Eat another day!");
	}
}