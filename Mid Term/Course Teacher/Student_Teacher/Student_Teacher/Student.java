import java.lang.*;
public class Student
{
	private String name;
	private int id;
	private double cgpa;
	private static int count = 0;
	public Student()
	{
		System.out.println("Empty Student");
		count++;
	}
	public Student(String name, int id, double cgpa)
	{
		System.out.println("Parameterized Student");
		//this.name = name;
		//this.id = id;
		//this.cgpa = cgpa;
		setName(name);
		setID(id);
		setCgpa(cgpa);
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
	public void setCgpa(double cgpa)
	{
		if(cgpa>=0 && cgpa<=4)
		{
			this.cgpa = cgpa;
		}
		else
		{
			System.out.println("Invalid CGPA");
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
	public double getCgpa()
	{
		return cgpa;
	}
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
		System.out.println("CGPA: "+cgpa);
	}
	public void checkScholarship()
	{
		if(cgpa>=3.75)
		{
			System.out.println("Eligible for Scholarship");
		}
		else
		{
			System.out.println("Not Eligible for Scholarship");
		}
	}
	public static int getCount()
	{
		return count;
	}
	static
	{
		System.out.println("Static block 1 in Student class");
	}
	static
	{
		System.out.println("Static block 2 in Student class");
	}
	
}