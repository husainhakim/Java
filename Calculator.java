public class Calculator {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in); // Scanner without import
        
        System.out.println("Welcome to the Java Calculator!");
        System.out.println("Please enter the first number:");
        double num1 = scanner.nextDouble();
        
        System.out.println("Please enter the second number:");
        double num2 = scanner.nextDouble();
        
        System.out.println("Please choose an operation (+, -, *, /):");
        char operator = scanner.next().charAt(0);
        
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
        }
        
        scanner.close();
    }
}
