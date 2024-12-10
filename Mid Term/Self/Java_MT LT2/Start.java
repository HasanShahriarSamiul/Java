import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Student " + (i+1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("ID: ");
            String id = sc.nextLine();

            System.out.println("The Valid range for CGPA is 0 to 4.00 ");
            System.out.print("CGPA: ");
            double cgpa = sc.nextDouble();
            sc.nextLine();

            students[i] = new Student(name, id, cgpa);
        }

        Teacher[] teachers = new Teacher[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Teacher " + (i+1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("ID: ");
            String id  = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            teachers[i] = new Teacher(name, id, salary);
        }

        System.out.println("\nStudent Details:");
        for (Student student : students) {
            student.display();
            if (student.checkScholarship()) {
                System.out.println("This student is eligible for a scholarship.");
            } else {
                System.out.println("This student is not eligible for a scholarship.");
            }
        }

        System.out.println("\nTeacher Details:");
        for (Teacher teacher : teachers) {
            teacher.display();
            System.out.println("Yearly Salary: " + teacher.yearlySalary());
            System.out.println("Yearly Salary with Bonus: " + teacher.yearlySalaryWithBonus());
        }

        sc.close();
    }
}
