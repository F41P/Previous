import java.util.Scanner;

public class lab8 {
    //part 1.1
//    public static double power(int num) {
//        double result;
//        result = Math.pow(2,num);
//        return result;
//    }
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Please input number : ");
//        int number = input.nextInt();
//
//        double resultPower = power(number);
//
//        System.out.println("Result of 2 power of "+number+"is "+resultPower);
//    }

    //part 1.2
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return num1;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        lab8 calculator = new lab8();
        System.out.println("Enter number: ");
        double result = scanner.nextDouble();
        while (true) {


            System.out.println("Enter a word (add, subtract, multiply, divide, exit): ");
            String operation = scanner.next();

            if (operation.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Enter number: ");
            double num = scanner.nextDouble();

            switch (operation) {
                case "add":
                    result = calculator.add(result, num);
                    break;
                case "subtract":
                    result = calculator.subtract(result, num);
                    break;
                case "multiply":
                    result = calculator.multiply(result, num);
                    break;
                case "divide":
                    result = calculator.divide(result, num);
                    break;
                default:
                    System.out.println("Invalid operation. Please try again.");
                    continue;
            }
            System.out.println("Currently, num = " + result);
        }
        System.out.println("Currently, num = " + result);
    }
}