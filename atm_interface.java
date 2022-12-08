import java.util.Scanner;

public class ATM {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Initialize balance to $1000
    double balance = 1000.0;

    // Initialize a boolean for whether the user wants to continue using the ATM
    boolean userContinues = true;

    // Continuously prompt the user for actions until they choose to exit
    while (userContinues) {
      // Print the main menu
      System.out.println("Welcome to the ATM!");
      System.out.println("1. Check balance");
      System.out.println("2. Withdraw funds");
      System.out.println("3. Deposit funds");
      System.out.println("4. Exit");

      // Read the user's choice
      int choice = input.nextInt();

      // Perform the selected action
      if (choice == 1) {
        // Check balance
        System.out.println("Your balance is: $" + balance);
      } else if (choice == 2) {
        // Withdraw funds
        System.out.println("Enter amount to withdraw: ");
        double amount = input.nextDouble();
        if (amount > balance) {
          // Cannot withdraw more than the available balance
          System.out.println("Insufficient funds");
        } else {
          balance -= amount;
          System.out.println("Successfully withdrew $" + amount);
        }
      } else if (choice == 3) {
        // Deposit funds
        System.out.println("Enter amount to deposit: ");
        double amount = input.nextDouble();
        balance += amount;
        System.out.println("Successfully deposited $" + amount);
      } else if (choice == 4) {
        // Exit
        userContinues = false;
        System.out.println("Thank you for using the ATM. Goodbye!");
      } else {
        // Invalid input
        System.out.println("Invalid choice. Please try again.");
      }
    }
  }
}
