import java.lang.*;
public class Employee 
{
    private String name;
    private int id;
    private double monthlySalary;

    public Employee() {
        System.out.println("Empty Employee");
    }

    public Employee(String name, int id, double monthlySalary) {
        this.name = name;
        this.id = id;
        this.monthlySalary = monthlySalary;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Monthly Salary: " + monthlySalary);
    }

    public void yearlySalary() {
        double yearlySalary = monthlySalary * 12;
        System.out.println("Yearly Salary: " + yearlySalary);
    }

    public void yearlySalaryWithBonus() {
        double bonus = monthlySalary * 0.30 * 2; 
        double yearlySalaryWithBonus = (monthlySalary * 12) + bonus;
        System.out.println("Yearly Salary with Bonus: " + yearlySalaryWithBonus);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setName("Hasan Shahriar Samiul");
        emp1.setId(601);
        emp1.setMonthlySalary(25000);
        emp1.display();
        emp1.yearlySalary();
        emp1.yearlySalaryWithBonus();

        Employee emp2 = new Employee("Aminul Haque", 602, 27300);
        emp2.display();
        emp2.yearlySalary();
        emp2.yearlySalaryWithBonus();
    }
}
