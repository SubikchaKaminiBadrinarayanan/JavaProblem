import java.util.Scanner;

public class ProcessName {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your name: ");

        // Read the entire line as a single string
        String fullName = console.nextLine();

        // Process the name and display the result
        processAndDisplayFullName(fullName);
        console.close();
    }

    // Method to process the name and display the result
    public static void processAndDisplayFullName(String fullName) {
        // Find the index where the last name starts
        int lastNameStartIndex = fullName.lastIndexOf(' ') + 1;

        // Extract the first and last name
        String lastName = fullName.substring(lastNameStartIndex);
        char firstNameInitial = fullName.charAt(0);

        // Display the processed name
        System.out.println("Your name is: " + lastName + ", " + firstNameInitial + ".");
      
     
    }
}
