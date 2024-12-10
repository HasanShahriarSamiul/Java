import java.lang.*;
public class Teacher
{
	private String name;
	private int id;
	private double salary;
	private static int count = 0;
	public Teacher()
	{
		System.out.println("Empty Teacher");
		count++;
	}
	public Teacher(String name, int id, double salary)
	{
		System.out.println("Parameterized Teacher");
		//this.name = name;
		//this.id = id;
		//this.salary = salary;
		setName(name);
		setID(id);
		setSalary(salary);
		count++;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setID(int id)
	{
		this.id = id;
	}
	public void setSalary(double salary)
	{
		if(salary>0)
		{
			this.salary = salary;
		}
		else
		{
			System.out.println("Invalid salary");
		}
	}
	public String getName()
	{
		return name;
	}
	public int getID()
	{
		return id;
	}
	public double getSalary()
	{
		return salary;
	}
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
		System.out.println("Salary: "+salary);
	}
	public void yearlySalary()
	{
		double yearlySal = salary*12;
		System.out.println("Yearly Salary: "+yearlySal);
	}
	public void yearlySalaryWithBonus()
	{
		double bonus = salary*.5;
		double yearlySalBonus = (salary*12) + (2*bonus);
		System.out.println("Yearly Salary with Bonus: "+yearlySalBonus);
		
	}
	public static int getCount()
	{
		return count;
	}
	static
	{
		System.out.println("Static block 1 in Teacher class");
	}
	static
	{
		System.out.println("Static block 2 in Teacher class");
	}
	
	
}