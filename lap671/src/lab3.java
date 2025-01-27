import java.util.Scanner;
public class lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    //lap3.2
//     int totalCredits = 0;
//     double totalGradePoints = 0.0;
//     System.out.println("Enter your grades (0 to 4) and credits (positiveinteger) foreach course.");
//     System.out.println("Enter 'Z' when done.");
//     while (true) {
//     System.out.print("Enter grade (0 to 4) or 'Z': ");
//     String input = scanner.next().toUpperCase();
//     if (input.equals("Z")) {
//     break;}
//     int grade = Integer.parseInt(input);
//     System.out.print("Enter credits: ");
//     int credits = scanner.nextInt();
//     totalGradePoints += grade * credits;
//     totalCredits += credits;}
//     if (totalCredits > 0) {
//     double gpa = totalGradePoints / totalCredits;
//     System.out.printf("Your GPA is %.2f%n", gpa);
//     } else {
//     System.out.println("No valid courses entered. GPA cannot be calculated.");
//     }
        //lap3.3
//     System.out.print("Enter the number of integers: ");
//     int numIntegers = scanner.nextInt();
//     int sum = 0;
//     for (int i = 1; i <= numIntegers; i++) {
//     System.out.print("Enter integer " + i + ": ");
//     int currentInt = scanner.nextInt();
//     sum += currentInt;}
//     double average = (double) sum / numIntegers;
//     System.out.println("Total number of integers: " + numIntegers);
//     System.out.println("Sum of the integers: " + sum);
//     System.out.println("Average of the integers: " + average);
//     if (numIntegers % 2 == 0) {
//     System.out.println("Total number of integers is even.");
//     } else {
//     System.out.println("Total number of integers is odd.");
//     }
    //lap3.4
//     System.out.print("Enter a non-negative integer: ");
//     int num = scanner.nextInt();
//     int factorial = 1;
//     int i = num;
//     while (i > 0) {
//     factorial *= i;
//     i--;
//     }
//     System.out.println("The factorial of " + num + " is " + factorial);
//     }
    //lap3.5
//        System.out.print("Enter an index: ");
//        int n = scanner.nextInt();
//        int a = 0, b = 1, c;
//        if (n == 0) {
//            System.out.println("The Fibonacci number at index " + n + " is " + a);
//        } else if (n == 1) {
//            System.out.println("The Fibonacci number at index " + n + " is " + b);
//        } else {
//            int i = 2;
//            while (i <= n) {
//                c = a + b; // Calculate the next Fibonacci number
//                a = b; // Move to the next pair
//                b = c; // Move to the next pair
//                i++; // Increment the counter
//            }
//            System.out.println("The Fibonacci number at index " + n + " is " + b);
//        }
    }
}
