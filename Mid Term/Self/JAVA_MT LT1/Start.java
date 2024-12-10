import java.lang.*;

public class Start {
    public static void main(String[] args) {
        
        Student[] students = new Student[5];
        students[0] = new Student("Alice", 101, 3.8);
        students[1] = new Student("Bob", 102, 3.2);
        students[2] = new Student("Charlie", 103, 3.5);
        students[3] = new Student("Diana", 104, 3.9);
        students[4] = new Student("Eve", 105, 2.8);

       
        Teacher[] teachers = new Teacher[5];
        teachers[0] = new Teacher("Prof. Smith", 201, 50000);
        teachers[1] = new Teacher("Prof. Johnson", 202, 55000);
        teachers[2] = new Teacher("Prof. Williams", 203, 52000);
        teachers[3] = new Teacher("Prof. Brown", 204, 51000);
        teachers[4] = new Teacher("Prof. Jones", 205, 53000);

        
        System.out.println("Student Details:");
        for (Student student : students) {
            student.display();
            if (student.checkScholarship()) {
                System.out.println("This student is eligible for a scholarship.");
            } else {
                System.out.println("This student is not eligible for a scholarship.");
            }
        }
   
        System.out.println("Teacher Details:");
        for (Teacher teacher : teachers) {
            teacher.display();
            System.out.println("Yearly Salary: " + teacher.yearlySalary());
            System.out.println("Yearly Salary with Bonus: " + teacher.yearlySalaryWithBonus());
        }
    }
}
