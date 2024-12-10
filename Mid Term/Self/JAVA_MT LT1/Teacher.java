import java.lang.*;

public class Teacher {
    private String name;
    private int id;
    private double salary;

    public Teacher() {
		System.out.println("Default Constructors called for teacher Class");
	}

    public Teacher(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void display() {
        System.out.println("Teacher Name: " + name + ", ID: " + id + ", Monthly Salary: " + salary);
    }

    public double yearlySalary() {
        return salary * 12;
    }

    public double yearlySalaryWithBonus() {
        return yearlySalary() + (salary * 0.5 * 2);
    }
}
