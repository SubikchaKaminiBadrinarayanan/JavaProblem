import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
        // Declare a valid PIN
        int validPin = 1234;

        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the PIN
        System.out.print("Enter your PIN: ");

        // Keep prompting until a valid PIN is entered
        while (true) {
            // Read the user-entered PIN
            int enteredPin = scanner.nextInt();

            // Compare the entered PIN with the valid PIN
            if (enteredPin == validPin) {
                // Correct PIN entered, break out of the loop
                System.out.println("Correct PIN! You now have access to your account.");
                break;
            } else {
                // Incorrect PIN, prompt the user to enter again
                System.out.print("Incorrect PIN. Please enter again: ");
            }
        }

        // Close the Scanner
        scanner.close();
    }
}
