import java.util.InputMismatchException;
import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 1000.0;
        boolean userContinues = true;

        while (userContinues) {
            System.out.println("Welcome to the ATM!");
            System.out.println("1. Check balance");
            System.out.println("2. Withdraw funds");
            System.out.println("3. Deposit funds");
            System.out.println("4. Exit");

            try {
                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Your balance is: $" + balance);
                        break;
                    case 2:
                        System.out.println("Enter amount to withdraw: ");
                        double withdrawAmount = input.nextDouble();
                        if (withdrawAmount > balance) {
                            System.out.println("Insufficient funds");
                        } else {
                            balance -= withdrawAmount;
                            System.out.println("Successfully withdrew $" + withdrawAmount);
                        }
                        break;
                    case 3:
                        System.out.println("Enter amount to deposit: ");
                        double depositAmount = input.nextDouble();
                        balance += depositAmount;
                        System.out.println("Successfully deposited $" + depositAmount);
                        break;
                    case 4:
                        userContinues = false;
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid choice.");
                input.nextLine(); // Clear the invalid input from the scanner
            }
        }
    }
}
