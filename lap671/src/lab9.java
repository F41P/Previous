import java.util.Scanner;

public class lab9 {
    //past2.1
//    public static int labMethodQ1(int x, int y) {
//        // ตรวจสอบว่าทั้งสองค่าเป็นบวกหรือไม่
//        if (x < 0 || y < 0) {
//            return 0;
//        } else {
//            // ถ้าทั้งสองค่าเป็นบวก ให้คืนค่าผลรวม
//            return x + y;
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter integer 1: ");
//        int x = input.nextInt();
//
//        System.out.print("Enter integer 2: ");
//        int y = input.nextInt();
//
//        System.out.println("Summation result: " + labMethodQ1(x, y));
//    }
    //past2.2
    public static String checkOddEven(int num) {
        if (num % 2 == 0) {
            return "EVEN";
        } else {
            return "ODD";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        System.out.println("The number is: " + checkOddEven(num));
    }
}
