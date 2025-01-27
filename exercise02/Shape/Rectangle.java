package main.java.org.dii.oop.exercise02.Shape;

public class Rectangle {
    double width;
    double height;
    public static int countRectangle;

    public double callAera(){
        return width*height;
    }

    public void setWidth(double width, double height){
        this.width = width;
        this.height = height;
        countRectangle++;
    }

    public void displayArea(){
        System.out.println("The rectangle area is "+callAera());
    }

    public static int getCountRectangle() {
        return countRectangle;
    }
}
