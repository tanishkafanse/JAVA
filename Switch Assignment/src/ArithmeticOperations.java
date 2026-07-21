
public class ArithmeticOperations {
    public static void main(String[] args) {
       java.util.Scanner sc = new java.util.Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Input operator
        System.out.print("Enter operator (+, -, *, /, %): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Result = " + (num1 + num2));
                break;

            case '-':
                System.out.println("Result = " + (num1 - num2));
                break;

            case '*':
                System.out.println("Result = " + (num1 * num2));
                break;

            case '/':
                if (num2 != 0)
                    System.out.println("Result = " + (num1 / num2));
                else
                    System.out.println("Division by zero is not allowed.");
                break;

            case '%':
                if (num2 != 0)
                    System.out.println("Result = " + (num1 % num2));
                else
                    System.out.println("Modulus by zero is not allowed.");
                break;

            default:
                System.out.println("Invalid operator!");
        }

        sc.close();
    }
}