import java.util.Scanner;

public class TrafficLightSwitch {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a color code: ");
        int currentColor = scanner.nextInt();

        // Determine the next traffic light color using switch statement
        String nextColor = getNextTrafficLightColor(currentColor);

        // Display the result
        System.out.println(nextColor);

        scanner.close();
    }

    public static String getNextTrafficLightColor(int currentColor) {
        switch (currentColor) {
            case 1:
                return "Next Traffic Light is Green";
            case 2:
                return "Next Traffic Light is Yellow";
            case 3:
                return "Next Traffic Light is Red";
            default:
                return "Invalid color";
        }
    }
}
