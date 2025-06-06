public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        if (b == 0) {
            System.out.println("Error can't divide by Zero");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition (5 + 3): " + calc.add(5, 3));
        System.out.println("Subtraction (5 - 3): " + calc.sub(5, 3));

	System.out.println("Multiplication (5 * 3): " + calc.mul(5, 3));
        System.out.println("Division (5 / 3): " + calc.div(5, 3));
    }
}
