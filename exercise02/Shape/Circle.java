package main.java.org.dii.oop.exercise02.Shape;

public class Circle {
    double radius;

    public static int countCircle;
    public double callArea(){
        return radius*radius*3.14;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        countCircle++;
    }

    public void displayArea(){
        System.out.println("The circle area is "+ callArea());
    }

    public static int getCountCircle() {
        return countCircle;
    }
}
