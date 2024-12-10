
public class Teacher {
    private String name;
    private String id;
    private double salary;

    public Teacher() {}

    public Teacher(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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

