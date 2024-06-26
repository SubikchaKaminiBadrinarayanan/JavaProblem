import java.util.Scanner;

public class ColorRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a color code: ");
        double wavelength = scanner.nextDouble();

        // Determine the corresponding color
        String color = getColor(wavelength);

        // Display the result
        System.out.println("The color is " + color);

        scanner.close();
    }

    public static String getColor(double wavelength) {
        if (wavelength >= 380 && wavelength < 450) {
            return "Violet";
        } else if (wavelength >= 450 && wavelength < 495) {
            return "Blue";
        } else if (wavelength >= 495 && wavelength < 570) {
            return "Green";
        } else if (wavelength >= 570 && wavelength < 590) {
            return "Yellow";
        } else if (wavelength >= 590 && wavelength < 620) {
            return "Orange";
        } else if (wavelength >= 620 && wavelength < 750) {
            return "Red";
        } else {
            return "The entered wavelength is not a part of the visible spectrum";
        }
    }
}
