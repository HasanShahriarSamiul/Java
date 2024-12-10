
public class Student {
    private String name;
    private String id;
    private double cgpa;

    public Student() {}

    public Student(String name, String id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
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

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void display() {
        System.out.println("Student Name: " + name + ", ID: " + id + ", CGPA: " + cgpa);
    }

    public boolean checkScholarship() {
        return cgpa >= 3.5;
    }
}
