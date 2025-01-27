package main.java.org.dii.oop.exercise02;

import main.java.org.dii.oop.exercise02.Shape.Circle;
import main.java.org.dii.oop.exercise02.Shape.Rectangle;
import main.java.org.dii.oop.exercise02.Shape.Triangle;

import java.util.Scanner;

public class Lesson {
    // Look carefully! If you cannot run the program.
    // This method is not a static method.
    public static void run(){
while (true) {
    System.out.println("1. Circle\n" +
            "2. Rectangle\n" +
            "3. Triangle\n" +
            "Please select the shape [1-3] or [0] to exit:");
    Scanner input = new Scanner(System.in);
    int choice = input.nextInt();
    if (choice == 1) {
        System.out.println("Enter radius: ");
        double r = input.nextDouble();
        Circle x = new Circle();
        x.setRadius(r);
        x.displayArea();
    } else if (choice == 2) {
        System.out.println("Enter width: ");
        double w = input.nextDouble();
        System.out.println("Enter height: ");
        double h = input.nextDouble();
        Rectangle y = new Rectangle();
        y.setWidth(w, h);
        y.displayArea();
    } else if (choice == 3) {
        System.out.println("Enter base: ");
        double b = input.nextDouble();
        System.out.println("Enter height: ");
        double h = input.nextDouble();
        Triangle z = new Triangle();
        z.setHeight(b, h);
        z.displayArea();
    } else if (choice == 0) {
        System.out.println("The total number of circles is " + Circle.getCountCircle());
        System.out.println("The total number of triangle is " + Triangle.getCountTriangle());
        System.out.println("The total number of rectangle is " + Rectangle.getCountRectangle());
        break;
    }
}
    }
}
