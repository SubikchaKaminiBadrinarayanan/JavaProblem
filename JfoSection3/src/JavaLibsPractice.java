
import javax.swing.JOptionPane;

public class JavaLibsPractice {

    public static void main(String[] args) {
        // Prompt user for inputs
        String name = JOptionPane.showInputDialog("Enter your name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height in meters"));
        String favoriteColor = JOptionPane.showInputDialog("Enter your favorite color");
        String animal = JOptionPane.showInputDialog("Enter your favorite animal");
        String verb = JOptionPane.showInputDialog("Enter a verb (present tense)");
        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
        double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight in kilograms"));
        String adjective = JOptionPane.showInputDialog("Enter an adjective");

        // Perform calculations
        double bmi = weight / (height * height);

        // Generate and display the story
        String story = "Once upon a time, there was a person named " + name + ".\n ";
        story += name + " was " + age + " years old and had a height of " + height + " meters.\n ";
        story += "Their favorite color is calculated as " + bmi + ". The end.";

        // Display the story using JOptionPane
        JOptionPane.showMessageDialog(null, story);
    }
}
