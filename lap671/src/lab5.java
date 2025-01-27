import java.util.Scanner;
public class lab5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//lab5.1
// for(int i= 0;i <10;i=i+8)
// {
// System.out.println("i = "+i);
// }
// }
// }
        //lap5.2
// System.out.print("Enter the number of integers: ");
// int count = scanner.nextInt();
// String Number1 = "";
// String Number2 = "";
// int largest = Integer.MIN_VALUE;
// System.out.println("Enter the integers: ");
// for (int i = 0; i < count; i++) {
// int num = scanner.nextInt();
// if (num % 2 == 0) {
// Number1 += num;
// Number1 += " ";
// }
// if (isPrime(num)) {
// Number2 += num;
// Number2 += " ";
// }
// if (num > largest) {
// largest = num;
// }
// }
// System.out.println("Even number "+Number1);
// System.out.println("Prime number "+Number2);
// System.out.println("Largest number "+largest);
// }
// private static boolean isPrime(int n) {
// if (n <= 1) {
// return false;
// }
// for (int i = 2; i <= Math.sqrt(n); i++) {
// if (n % i == 0) {
// return false;
// }
// }
// return true;
// }
// }
        //lap5.3
//     System.out.print("enter the integer : ");
//     int num = scanner.nextInt();
//     for(int i = 1; i <=12; i++){
//    System.out.println(num +"*"+i+"="+(num*i));
//     }
//     }
//     }
        //lap5.4
//     System.out.print("Enter the first positive integer: ");
//     int a = scanner.nextInt();
//     System.out.print("Enter the second positive integer: ");
//     int b = scanner.nextInt();
//     System.out.print("Enter the third positive integer: ");
//     int c = scanner.nextInt();
//     int num;
//     for (int i = 0; i < 2; i++) {
//     if (a > b) {
//     num = a;
//     a = b;
//     b = num;
//     }
//     if (b > c) {
//     num = b;
//     b = c;
//     c = num;
//     }
//     }
//     System.out.println("Sorted integers from least to greatest.: " + a + " "+ b + " " + c);
//     }
//     }
        //lab5.5
//        System.out.print("Enter the number of lines: ");
//        int lines = scanner.nextInt();
//        for (int i = 1; i <= lines; i++) {
//            for (int j = 1; j <= lines - i; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 0; j < i; j++) {
//                System.out.print((char) ('A' + j) + " ");
//            }
//            for (int j = i - 2; j >= 0; j--) {
//                System.out.print((char) ('A' + j) + " ");
//            }
//            System.out.println();
//        }
    }
}
