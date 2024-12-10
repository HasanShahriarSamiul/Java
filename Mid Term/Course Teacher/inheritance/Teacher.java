import java.lang.*;
public class Teacher extends Person
{
	private double salary;
	
	public Teacher()
	{
		System.out.println("Empty Teacher");
	}
	public Teacher(String name, int age, double salary)
	{
		//super-> parent class
		//super()-> empty constructor of parent class
		//super(x, y)-> parameterized constructor of parent class 
		//setName(name);
		//setAge(age);
		super(name, age);
		System.out.println("Parameterized Teacher");
		setSalary(salary);
	}
	public void setSalary(double salary)
	{
		if(salary>0)
		{
			this.salary = salary;
		}
		else
		{
			System.out.println("Invalid value for salary");
		}
	}
	public double getSalary()
	{
		return salary;
	}
	public void display()
	{
		//System.out.println("Name: "+getName());
		//System.out.println("Age: "+getAge());
		super.display();
		System.out.println("Salary: "+salary);
	}
	public void yearlySalary()
	{
		double ySal = salary*12;
		System.out.println("Yearly Salary: "+ySal);
	}
	static
	{
		System.out.println("Time to eat!");
	}
}