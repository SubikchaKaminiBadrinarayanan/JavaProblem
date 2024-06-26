public class TestClass {

    public static void main(String[] args) {
        // Create an instance of ComputeMethods
        ComputeMethods computeMethods = new ComputeMethods();

        // Test and display results
        double celsius = computeMethods.fToC(101.0);
        System.out.println("Temp in Celsius is " + celsius);

        double hypotenuse = computeMethods.hypotenuse(18, 16);
        System.out.println("Hypotenuse is " + hypotenuse);

        int sumOfDice = computeMethods.roll();
        System.out.println("The sum of the dice values is " + sumOfDice);
    }
}
