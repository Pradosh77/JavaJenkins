public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition (5 + 3): " + calc.add(5, 3));
        System.out.println("Subtraction (5 - 3): " + calc.sub(5, 3));
    }
}
