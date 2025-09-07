//Calculator program in Java


import java.util.Scanner;

class cal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Choose an operation: ");
        System.out.print(" 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division\n");
        System.out.print("Enter operation number(1-4): ");
        int operation = scanner.nextInt();
        double result=0;
        switch (operation) {
            case 1:
                result = num1 + num2;
                break;
            case 2  :
                result = num1 - num2;
                break;
            case 3  :
                result = num1 * num2;
                break;
            case 4  :
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }
        System.out.println("Result: " + result);
    }
    
}
