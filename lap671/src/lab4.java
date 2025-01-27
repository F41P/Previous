import java.util.Scanner;
public class lab4 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        //lap4.1
        int evenSum = 0;
        int oddSum = 0;
        String number ;
        while(true){
            System.out.print("Enter the integer (Enter 'Z' when done)");
            number = scan.next();
            if(number.equalsIgnoreCase("Z")){
                System.out.println("Sum of even :+evenSum");
                System.out.println("Sum of odd :+oddSum");
                break;
            }
            if(Integer.parseInt(number)%2==0){
                evenSum = Integer.parseInt(number);
            }
            else if(Integer.parseInt(number)%2!=0){
                oddSum=Integer.parseInt(number);
            }
        }
        //lap4.2
//        String s1 = "1:-----";
//        String s2 = "2:-----";
//        String s3 = "3:-----";
//        String s4 = "4ฃฃ:-----";
//        String s5 = "5:-----";
//        String p1 = "";
//        String p2 = "";
//        String p1_text = "";
//        String p2_text = "";
//        int number;
//        while (true) {
//            int i = 1;
//            if (s3.equals("")) {
//                if (p1_text.equals("loser")) {
//                    System.out.println("The winner is player 2");
//                    System.out.println("The loser is player 1");
//                } else if (p2_text.equals("loser")) {
//                    System.out.println("The winner is player 1");
//                    System.out.println("The loser is player 2");
//                }
//                break;
//            }
//            System.out.println("The total round: " + (p1.length() + p2.length()));
//            System.out.println("Player 1 picked: " + p1.length() + " stick(s)");
//            System.out.println("Player 2 picked: " + p2.length() + " stick(s)");
//            while (i <= 2) {
//                if (s3.equals("")) {
//                    break;
//                }
//                System.out.println("Sticks on the table:");
//                System.out.println(s1);
//                System.out.println(s2);
//            }
//        }
    }
}