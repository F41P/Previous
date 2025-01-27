package main.java.org.dii.oop.exercise02;

import main.java.org.dii.oop.exercise01.Book;

public class Lesson {
    public static void run() {
        Book myBook01 = new Book();
        myBook01.title = "Milkman: A Novel";
        myBook01.author = " Anna Burns";
        myBook01.numberOfPages = 200;
        System.out.println("The title of the book is "+myBook01.title+"\nIt's author is "+myBook01.author+"\nIt contains "+myBook01.numberOfPages);

        Book myBook02 = new Book();
        myBook02.title = "The Undefeated";
        myBook02.author = "Kwame Alexander, Kadir Nelson";
        myBook02.numberOfPages = 300;
        System.out.println("The title of the book is "+ myBook02.title+"\nIt's author is "+ myBook02.author+"\nIt contains "+ myBook02.numberOfPages);
    }
}
