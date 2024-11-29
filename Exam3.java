import java.util.Scanner;

public class Exam3 {
    // Instance variables
    private String name;
    private int id;
    private double salary;

    // Constructor to initialize instance variables
    public Exam3(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    // Method to raise salary by 10%
    public void raiseSalary() {
        salary += salary * 0.10; // Increase salary by 10%
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

    // Main method to test the class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting user input for employee details
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();

        // Creating an employee object with user-defined values
        Exam3 emp = new Exam3(name, id, salary);

        // Displaying initial details
        System.out.println("\nBefore Salary Raise:");
        emp.displayDetails();

        // Raising salary
        emp.raiseSalary();

        // Displaying details after salary raise
        System.out.println("\nAfter Salary Raise:");
        emp.displayDetails();

        scanner.close();
    }
}
