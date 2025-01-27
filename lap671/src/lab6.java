import java.util.Scanner;

public class lab6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        //lab6.1
//        String[] name = {"New","Tao","Boom","View","Prang"};
//
//        System.out.println("The most lucky student is "+name[0]);
//        System.out.println("The most handsome student is "+name[1]);
//        System.out.println("The most beautiful student is "+name[2]);
//        System.out.println("The most funny student is "+name[3]);
//        System.out.println("The most tallest student is "+name[4]);

        //lab6.2
//       double[] doubles = new double[10];
//       System.out.println("Enter 10 doubles ");
//
//        for (int i = 0; i < 10; i++) {
//            System.out.print("double "+(i+1)+": ");
//            doubles[i] = input.nextDouble();
//        }
//        System.out.print("Enter one more double : ");
//        double newDouble = input.nextDouble();
//
//       boolean found = false;
//       for (double x : doubles){
//           if (x == newDouble) {
//               found = true;
//               break;
//           }
//        }
//        if(found){
//            System.out.println("The double "+newDouble+" is in the array.");
//        }else {
//            System.out.println("The double "+newDouble+" is not in the array.");
//        }

        //lab6.3
//        double[] a = new double[15];//จองพื้นที่
//        System.out.println("Enter 15 double values");
//        //ประกาศรับตัวแปล
//        for (int i = 0; i < 15; i++) {
//            System.out.print("Double "+(i+1)+": ");
//            a[i] = input.nextDouble();
//        }
//
//        System.out.println("Array before modification:");
//        for (int i = 0; i < 15; i++){
//            System.out.print(a[i]+" ");
//        }
//        System.out.println();
//
//        System.out.print("Enter index yo replace (0-14): ");
//        int index = input.nextInt();
//
//        if (index < 0 || index >= 15){
//            System.out.println("Invalid index! Please run the program again and enter a valid index.");
//        }else {
//            System.out.print("Enter the new value : ");
//            double newValue = input.nextDouble();
//
//            a[index] = newValue;
//
//            System.out.println("Array after replacement : ");
//            for (int i = 0; i < 15; i++){
//                System.out.print(a[i]+" ");
//            }
//            System.out.println();
//        }

        //lab6.4
//        String[] name = new String[5];
//        double[] height = new double[5];
//
//        System.out.println("Enter the names and heights of 5 students : ");
//
//        for (int i = 0; i < 5; i++){
//            System.out.print("Student "+(i+1)+" name : ");
//            name[i] = input.next();
//            System.out.print("Student "+(i+1)+" height : ");
//            height[i] = input.nextDouble();
//        }
//        int tallest = 0;
//        for (int i = 1; i < 5; i++) {
//            if (height[i] > height[tallest]) {
//                tallest = i;
//            }
//        }
//        System.out.println("The tallest student is "+name[tallest]+" with a height of "+height[tallest]+" meters.");

//        lab6.5
        int[] array = {1,5,9,11,12,13,14,15,19,22};

        System.out.println("Original array : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();

        System.out.println("Enter new value : ");
        int newValue = input.nextInt();

        int[] newArray = new int[10];
        boolean inserted = false;
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (!inserted && newValue < array[i]){
                newArray[j++] = newValue;
                inserted = true;
            }
            if (j < newArray.length){
                newArray[j++] = array[i];
            }
        }
        if (!inserted){
            newArray[j] = newValue;
        }
        System.out.println("Updated array : ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]+" ");
        }
        System.out.println();
    }
}

