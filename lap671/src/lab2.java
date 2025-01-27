import java.util.Scanner;
public class lab2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Lap2.1
//    System.out.println("what is your age ?");
//    System.out.print("Answer ");
//    int age = input.nextInt();
//    if (age < 18) {
//        System.out.println("You are not allowed to apply for a driving license");
//    } else {
//        System.out.println("You are an adult. What is your name ?");
//        System.out.print("My name is ");
//        String name = input.next();
//        System.out.println("That's is a very good name :), " + name);
//    }
//    System.out.println("The end of the program");
        // Lap2.2
//        System.out.println("The total number of the classes:");
//        int totalClasses = input.nextInt();
//        System.out.println("How many times the student came late:");
//        int lest = input.nextInt();
//        System.out.println("How many times the student was absent");
//        int absent = input.nextInt();
//        double cal = lest / 2 + absent;
//        if (cal <= (0.2 * totalClasses)) {
//            System.out.println("The student can take the exam");
//        } else {
//            System.out.println("The student cannot take the exam");
//        }

        //Lap2.3
//    System.out.print("What subject did you enroll:");
//    String subject1 = input.nextLine();
//    System.out.printf(subject1+" credit is ");
//    int credit1 = input.nextInt();
//    input.nextLine();
//    System.out.printf("Grade of "+subject1+" is ");
//    String grade1 = input.nextLine();
//    System.out.print("What subject did you enroll:");
//    String subject2 = input.nextLine();
//    System.out.printf(subject2+" credit is ");
//    int credit2 = input.nextInt();
//    input.nextLine();
//    System.out.print("Grade of "+subject2+" is ");
//    String grade2 = input.nextLine();
//    int pointValue1 = 0;
//    int pointValue2 = 0;
//    switch (grade1.toUpperCase()) {
//        case "A":
//            pointValue1 = 4;
//            break;
//        case "B":
//            pointValue1 = 3;
//            break;
//        case "C":
//            pointValue1 = 2;
//            break;
//        case "D":
//            pointValue1 = 1;
//            break;
//        case "F":
//            pointValue1 = 0;
//            break;
//        default:
//            System.out.println("invalid grade entered");
//    }
//    switch (grade2.toUpperCase()) {
//        case "A":
//            pointValue2 = 4;
//            break;
//        case "B":
//            pointValue2 = 3;
//            break;
//        case "C":
//            pointValue2 = 2;
//            break;
//        case "D":
//            pointValue2 = 1;
//            break;
//        case "F":
//            pointValue2 = 0;
//            break;
//        default:
//            System.out.println("invalid grade entered");
//    }
//    double sub1plus2 = (pointValue1*credit1 + pointValue2*credit2);
//    double totalcredit = (credit1+credit2);
//    double gpa;
//    gpa = (sub1plus2/totalcredit);
//    System.out.print("Tom Smith's GPA is : "+ gpa);
        //lab2.4
//    Scanner scan = new Scanner(System.in);
//    System.out.print("Enter the total price: ");
//    double totalPrice = scan.nextDouble();
//    System.out.print("Are you a silver or gold member? (Enter 'silver' or 'gold'): ");
//    String membershipStatus = scan.next().toLowerCase();
//    double discountRate;
//    if (membershipStatus.equals("silver")) {
//        if (totalPrice <= 1000) {
//            discountRate = 0.02;
//        } else {
//            discountRate = 0.03;
//        }
//    } else if (membershipStatus.equals("gold")) {
//        if (totalPrice <= 10000) {
//            discountRate = 0.05;
//        } else if (totalPrice > 10000 && totalPrice <= 100000) {
//            discountRate = 0.08;
//        } else {
//            discountRate = 0.10;
//        }
//    } else {
//        discountRate = 0.0;
//    }
//    double discountedAmount = totalPrice * (1 - discountRate);
//    System.out.println("\nMembership Status: " + membershipStatus);
//    System.out.println("Total Price: $" + totalPrice);
//    System.out.println("Discount Rate: " + (discountRate * 100) +"%");
//    System.out.println("Pay : "+discountedAmount);
    }
}