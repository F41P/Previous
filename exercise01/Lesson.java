package main.java.org.dii.oop.exercise01;

public class Lesson {
    public static void run(){

        System.out.println("Test");
        Book myBook = new Book();

        myBook.title = "Going Down Home with Daddy";
        myBook.author = "Starling Lyons, Daniel Minter";
        myBook.numberOfPages = 400;
        System.out.println("The title of the book is " + myBook.title + "\nIts author is " + myBook.author + "\nIt contains " + myBook.numberOfPages);
    }
}
