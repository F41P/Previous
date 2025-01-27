package main.java.org.dii.oop.exercise02.Shape;

public class Triangle {
    double base;
    double height;
    public static int countTriangle;

    public double callArea(){
        return 0.5*base*height;
    }

    public void setHeight(double base, double height) {
        this.base = base;
        this.height = height;
        countTriangle++;
    }

    public void displayArea(){
        System.out.println("The triangle area is "+callArea());
    }

    public static int getCountTriangle() {
        return countTriangle;
    }
}
