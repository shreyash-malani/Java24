import java.util.Scanner;

public class Exam4 {
    // Static variable to store annual interest rate
    private static double annualInterestRate;

    // Instance variable for the account balance
    private double savingsBalance;

    // Constructor to initialize savings balance
    public Exam4(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    // Static method to modify the interest rate
    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }

    // Method to calculate monthly interest
    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest; // Add the interest to the balance
    }

    // Method to display the savings balance
    public void displayBalance() {
        System.out.printf("Current Savings Balance: %.2f%n", savingsBalance);
    }

    // Main method to test the class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the initial annual interest rate
        System.out.print("Enter the initial annual interest rate (e.g., 0.04 for 4%): ");
        double initialInterestRate = scanner.nextDouble();
        Exam4.modifyInterestRate(initialInterestRate);

        // Accept details for the first account
        System.out.print("Enter the initial balance for Account 1: ");
        double balance1 = scanner.nextDouble();
        Exam4 account1 = new Exam4(balance1);

        // Accept details for the second account
        System.out.print("Enter the initial balance for Account 2: ");
        double balance2 = scanner.nextDouble();
        Exam4 account2 = new Exam4(balance2);

        // Calculate and display monthly interest for both accounts
        System.out.println("\nBalances after one month of interest:");
        account1.calculateMonthlyInterest();
        account1.displayBalance();

        account2.calculateMonthlyInterest();
        account2.displayBalance();

        // Accept the updated interest rate
        System.out.print("\nEnter the updated annual interest rate (e.g., 0.05 for 5%): ");
        double updatedInterestRate = scanner.nextDouble();
        Exam4.modifyInterestRate(updatedInterestRate);

        // Calculate and display monthly interest again
        System.out.println("\nBalances after another month with updated interest rate:");
        account1.calculateMonthlyInterest();
        account1.displayBalance();

        account2.calculateMonthlyInterest();
        account2.displayBalance();

        scanner.close();
    }
}
