package main.java.org.dii.oop.exercise02;

public class Student {
    String name;
    String lastname;
    int age;

    public Student(){
        name = "Unknown";
        lastname = "Unknown";
        age = 0;
    }
    public Student(String n, String l, int a){
        name = n;
        lastname = l;
        age = a;
    }
    public String getName(){
        return name;
    }

    public void displayInfo(){
        System.out.println("Name: "+name+"\nLast name: "+lastname+"\nAge: "+age);
    }
}
