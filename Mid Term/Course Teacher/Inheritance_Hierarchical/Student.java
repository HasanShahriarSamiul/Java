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
		//super-> parent class
		//super()-> empty constructor of parent class
		//super(x, y)-> parameterized constructor of parent class 
		super(name, age);
		System.out.println("Parameterized Student");
		setCgpa(cgpa);
	}
	public void setCgpa(double cgpa)
	{
		if(cgpa>=0 && cgpa<=4)
		{
			this.cgpa = cgpa;
		}
		else
		{
			System.out.println("Invalid value for cgpa");
		}
	}
	public double getCgpa()
	{
		return cgpa;
	}
	public void display()
	{
		//System.out.println("Name: "+getName());
		//System.out.println("Age: "+getAge());
		super.display();
		System.out.println("CGPA: "+cgpa);
	}
	static
	{
		System.out.println("What time is it?");
	}
}