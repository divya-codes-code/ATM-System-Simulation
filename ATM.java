import java.util.Scanner;

public class ATM {
    private static final int PIN = 1234;
    private static double userBalance = 10000;
    private static double atmBalance = 5000;
    private static final double MAX_DEPOSIT = 50000;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // PIN validation
        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();
        
        if (enteredPin == PIN) {
            boolean isRunning = true;
            
            while (isRunning) {
                // Displaying menu options
                System.out.println("\nATM Menu:");
                System.out.println("1. Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                int choice = sc.nextInt();
                
                switch (choice) {
                    case 1: // Withdraw option
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = sc.nextDouble();
                        
                        if (withdrawAmount <= 0) {
                            System.out.println("Invalid amount. Please enter a positive value.");
                        } else if (withdrawAmount > userBalance) {
                            System.out.println("Insufficient account balance. Your current balance is: " + userBalance);
                        } else if (withdrawAmount > atmBalance) {
                            System.out.println("ATM doesn't have enough cash. Available ATM balance is: " + atmBalance);
                        } else {
                            userBalance -= withdrawAmount;
                            atmBalance -= withdrawAmount;
                            System.out.println("Withdrawal successful! Please collect your cash.");
                            System.out.println("Your remaining balance is: " + userBalance);
                            System.out.println("ATM remaining balance is: " + atmBalance);
                        }
                        break;

                    case 2: // Deposit option
                        System.out.print("Enter amount to deposit (Max ₹50,000): ");
                        double depositAmount = sc.nextDouble();

                        if (depositAmount <= 0) {
                            System.out.println("Invalid amount. Please enter a positive value.");
                        } else if (depositAmount > MAX_DEPOSIT) {
                            System.out.println("Deposit exceeds the maximum limit of ₹50,000.");
                        } else {
                            userBalance += depositAmount;
                            atmBalance += depositAmount;
                            System.out.println("Deposit successful!");
                            System.out.println("Your new balance is: " + userBalance);
                            System.out.println("ATM updated balance is: " + atmBalance);
                        }
                        break;

                    case 3: // Check balance
                        System.out.println("Your current balance is: " + userBalance);
                        System.out.println("ATM current balance is: " + atmBalance);
                        break;

                    case 4: // Exit
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        isRunning = false; // Exit the loop
                        break;

                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                        break;
                }
            }
        } else {
            System.out.println("Incorrect PIN. Please try again.");
        }
        sc.close();
    }
}
