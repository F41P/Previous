package main.java.org.dii.oop.exercise03;

public class Lesson {

    public static void displayPerson(Person p) {
        System.out.println("Name: " + p.fname +" "+ p.lname +"\nAge: "+ p.age);
        System.out.println();
    }

    public static void displayShape(Shape x) {
        System.out.println("Width: "+ x.width +"\nHeight: "+x.height);
        System.out.println();

    }
    public static void run(){

        Person info1 = new Person();
        info1.fname = "John";
        info1.lname = "Doe";
        info1.age = 24;

        Person info2 = new Person();
        info2.fname = "Emily";
        info2.lname = "Johnson";
        info2.age = 26;

        Person info3 = new Person();
        info3.fname = "Michael";
        info3.lname = "Smith";
        info3.age = 31;

        Person info4 = new Person();
        info4.fname = "James";
        info4.lname = "Wilson";
        info4.age = 21;

        Person info5 = new Person();
        info5.fname = "Olivia";
        info5.lname = "Davis";
        info5.age = 25;

        Shape details1 = new Shape();
        details1.width = 49;
        details1.height = 156;

        Shape details2 = new Shape();
        details2.width = 58;
        details2.height = 175;

        Shape details3 = new Shape();
        details3.width = 49;
        details3.height = 155;

        Shape details4 = new Shape();
        details4.width = 68;
        details4.height = 169;

        Shape details5 = new Shape();
        details5.width = 53;
        details5.height = 165;

        displayPerson(info1);
        displayPerson(info2);
        displayPerson(info3);
        displayPerson(info4);
        displayPerson(info5);

        displayShape(details1);
        displayShape(details2);
        displayShape(details3);
        displayShape(details4);
        displayShape(details5);

    }

}
