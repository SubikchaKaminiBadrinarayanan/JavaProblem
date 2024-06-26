import java.util.Random;
public class ComputeMethods {
    
    // Method to convert Fahrenheit to Celsius
    public double fToC(double degreesF) {
        return (5.0 / 9.0) * (degreesF - 32);
    }

    // Method to compute the hypotenuse of a triangle
    public double hypotenuse(int a, int b) {
        return Math.sqrt(a * a + b * b)*1/2;
    }

    // Method to simulate rolling two 6-sided dice and return their sum
    public int roll() {
        Random rand = new Random();
        int die1 = rand.nextInt(6) + 1;
        int die2 = rand.nextInt(6) + 1;
        return die1 + die2;
    }
}

