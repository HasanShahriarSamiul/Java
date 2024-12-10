import java.lang.*;
public class Student extends Person
{
	private double cgpa;
	public Student()
	{
		System.out.println("Empty Student");
	}
	public Student(String name, int age, double cgpa)
	{
		//super -> parent class
		//super() -> empty constructor of parent class
		//super(x, y) -> parameterized cons. of parent class
		super(name, age);
		System.out.println("Parameterized Student");
		this.cgpa = cgpa;
	}
	public void setCgpa(double cgpa)
	{
		this.cgpa = cgpa;
	}
	public double getCgpa()
	{
		return cgpa;
	}
	public void display()
	{
		super.display();
		System.out.println("Cgpa: "+cgpa);
	}
	
}
