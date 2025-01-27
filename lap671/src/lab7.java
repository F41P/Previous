import java.util.Scanner;

public class lab7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //lab7.1
//        int[][] a = new int[5][4];
//        for (int row = 0; row < a.length; row++) {
//            for (int col = 0; col < a[row].length; col++) {
//                System.out.print("Enter the value of a[" + row + "][" + col + "]:");
//                a[row][col] = input.nextInt();
//            }
//        }
//        for (int row = 0; row < a.length; row++) {
//            for (int col = 0; col < a[0].length; col++) {
////print values with space
//                System.out.print(a[row][col] + " ");
//            }
//// a newline for the next row
//            System.out.println();
//        }
        //1.
        //a.length คือจำนวนแถว โดย a ถูกประกาศเป็น new int[5][4] , a.length จึงเท่ากับ 5
        //a[row].length คือจำนวนคอลัมน์ ซึ่งในอาร์เรย์จะคืนค่า เท่ากับ 4
        //a[0].length คือจำนวนคอลัมน์ในแถวแรก , a[0].length คือ 4

        //2.
        //เท่าเสมอ เพราะ อาร์เรย์เริ่มที่0เหมือนกัน


        //lab7.2
//        final int student = 2;
//        String[] name = new String[student];
//        int[][] data = new int[student][2];
//
//        for(int row = 0; row < data.length; row++) {
//            System.out.print("Enter the name of student " + (row+1) + ": ");
//            name[row] = input.nextLine();
//            for(int col = 0; col < data[row].length; col++) {
//                System.out.print("Enter "+ ((col == 0)? "height" : "weight")+" of " + name[row] + ": ");
//                data[row][col] = Integer.parseInt(input.nextLine());
//            }
//        }
//        for(int row = 0; row < data.length; row++) {
//            System.out.print(name[row] + " : ");
//            for(int col = 0; col < data[row].length; col++) {
//                System.out.print(data[row][col] + " ");
//            }
//            System.out.println();
//        }

        //lab7.3
//        int sum_all = 0;
//        int sum_each_row[] = new int[2];
//        int sum_each_col[] = new int[8];
//        int table[][] = new int[2][8];
//
//        for (int row = 0; row < table.length; row++) {
//            for (int col = 0; col < table[row].length; col++) {
//                System.out.print("Enter the value of row " + row + " and column " + col + " : ");
//                table[row][col] = Integer.parseInt(input.nextLine());
//            }
//        }
//
//        for (int row = 0; row < table.length; row++) {
//            for (int col = 0; col < table[row].length; col++) {
//                sum_each_row[row] += table[row][col];
//                sum_each_col[col] += table[row][col];
//                sum_all += table[row][col];
//            }
//        }
//
//        for (int row = 0; row < table.length; row++) {
//            for (int col = 0; col < table[row].length; col++) {
//                System.out.print(table[row][col] + " ");
//            }
//            System.out.println("| " + sum_each_row[row]);
//
//        }
//
//        System.out.print("------------------------------");
//
//        System.out.println();
//        for (int col : sum_each_col) {
//            System.out.print(col + " ");
//        }
//        System.out.println("| " + sum_all);

        //lab7.4
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students : ");
        String[] subjects = {"Physics","Biology","Chemistry"};
        double[][] scores = new double[Integer.parseInt(sc.nextLine())][subjects.length];

        int[] sum_each_student = new int[scores.length],avg_each_student = new int[scores.length];
        double[] sum_each_subject = new double[subjects.length] ,avg_each_subject = new double[subjects.length];


        for(int student = 0; student  < scores.length; student ++){
            for (int subject = 0 ; subject < scores[student].length ; subject++){
                System.out.printf("Enter the %d student %s score : ",student+1 ,subjects[subject]);
                scores[student][subject] = Double.parseDouble(sc.nextLine());
            }
        }

        for(int student = 0; student  < scores.length; student ++){
            for (int subject = 0 ; subject < scores[student].length ; subject++){
                sum_each_student[student] += scores[student][subject];
                sum_each_subject[subject] += scores[student][subject];

                avg_each_student[student] = sum_each_student[student]/scores[student].length;
                avg_each_subject[subject] = sum_each_subject[subject]/scores.length;
            }

        }

        System.out.println("Physics, Biology, Chemistry | Total | Average");
        for (int student = 0 ; student < scores.length ; student++){
            System.out.printf("Student %d : ",student+1);
            for(int subject = 0 ; subject < scores[student].length ; subject++){
                System.out.print(scores[student][subject]+" " );
            }
            System.out.println("| "+sum_each_student[student]+" | " + avg_each_student[student]);
        }
        System.out.println("----------------------------");
        System.out.println("Average scores for Physics, Biology, and Chemistry");
        for (double subject : avg_each_subject) {
            System.out.print(subject+" ");
        }
        System.out.println("\n----------------------------");

        for (int student = 0 ; student < scores.length ; student++) {
            System.out.printf("Student %d : ", student + 1);
            for (int subject = 0; subject < scores[student].length; subject++) {
                System.out.print(((scores[student][subject] > avg_each_subject[subject]) ? "Pass " : "No "));
            }
            System.out.println();
        }
    }
}


