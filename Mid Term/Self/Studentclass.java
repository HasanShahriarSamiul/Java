import java.lang.*;
public class Student
{
	private int id;
	private double cgpa;
	public static int count = 0;
	
	public Student()
	{
		System.out.println("Empty Student");
		count++;
	}
	public Student(int id, double cgpa)
	{
		System.out.println("Parameterized Student");
		//this.id = id;
		setId(id);
		//this.cgpa = cgpa;
		setCgpa(cgpa);
		count++;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public void setCgpa(double cgpa)
	{
		if(cgpa>0 && cgpa<=4)
		{
			this.cgpa = cgpa;
		}
		else
		{
			System.out.println("Invalid Cgpa. Try again!");
		}
	}
	public int getId()
	{
		return id;
	}
	public double getCgpa()
	{
		return cgpa;
	}
	public void dekhao()
	{
		System.out.println("ID: "+id);
		System.out.println("CGPA: "+cgpa);
	}
	public void checkScholarshipEligibility()
	{
		if(cgpa>=3.75)
		{
			System.out.println("Eligible for Scholarship");
		}
		else
		{
			System.out.println("Not Eligible");
		}
	}
	public static void main(String [] args)
	{
		Student s1 = new Student();
		s1.setId(101);
		s1.setCgpa(3.5);
		System.out.println("S1.ID: "+s1.getId());
		System.out.println("S1.CGPA: "+s1.getCgpa());
		s1.checkScholarshipEligibility();
		
		Student s2 = new Student(102, 3.77);
		s2.dekhao();
		s2.checkScholarshipEligibility();
		
		System.out.println(s1.count);
		System.out.println(s2.count);
		System.out.println(Student.count);
	}
}
	
	
	
	
	
	
}
