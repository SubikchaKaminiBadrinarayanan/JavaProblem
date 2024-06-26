import java.util.Scanner;

public class TrafficLightChecker {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a color code: ");
        int currentColor = scanner.nextInt();

        // Determine the next traffic light color
        String nextColor = getNextTrafficLightColor(currentColor);

        // Display the result
        System.out.println(nextColor);

        scanner.close();
    }

    public static String getNextTrafficLightColor(int currentColor) {
        if (currentColor == 1) {
            return "Next Traffic Light is Green";
        } else if (currentColor == 2) {
            return "Next Traffic Light is Yellow";
        } else if (currentColor == 3) {
            return "Next Traffic Light is Red";
        } else {
            return "Invalid color";
        }
    }
}
