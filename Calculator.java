
public class Calculator {
    // Overloaded method with two integer parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with three integer parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with two double parameters
    public double add(double a, double b) {
        return a + b;
    }

    // Main method to test the overloaded methods
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Calling the overloaded methods
        System.out.println("Add two integers: " + calculator.add(10, 20)); // Calls add(int, int)
        System.out.println("Add three integers: " + calculator.add(10, 20, 30)); // Calls add(int, int, int)
        System.out.println("Add two doubles: " + calculator.add(10.5, 20.5)); // Calls add(double, double)
    }
}
