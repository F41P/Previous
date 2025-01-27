package main.java.org.dii.oop.exercise02;

public class Lesson {
    public static void run() {
        Student a = new Student("James","Smith",23);
        Student b = new Student("Emily", "Johnson",27);
        Student c = new Student("Michael", "Brown",28);
        Student d = new Student("Sarah", "Davis",21);
        Student e = new Student();

        a.displayInfo();
        System.out.println();
        b.displayInfo();
        System.out.println();
        c.displayInfo();
        System.out.println();
        d.displayInfo();
        System.out.println();
        e.displayInfo();
        System.out.println();
    }
}