import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Choose a number: ");
        int number = scanner.nextInt();

        // Display the multiples of the entered number from 1 to 12
        for (int i = 1; i <= 12; i++) {
            int result = number * i;
            System.out.println(number + "x" + i + " = " + result);
        }

        // Close the Scanner
        scanner.close();
    }
}
