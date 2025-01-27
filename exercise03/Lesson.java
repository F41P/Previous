package main.java.org.dii.oop.exercise03;

public class Lesson {
    public static void run(){
        MusicAlbum a = new MusicAlbum();
        a.displayInfo();

        String ariana[] = {"we can't be friend","bye","the boy is mine"};
        MusicAlbum b = new MusicAlbum("Eternal Sunshine", ariana);
        b.displayInfo();

        String sabrina[] = {"a nonsense christmas","santa doesn't known you like i do"};
        MusicAlbum c = new MusicAlbum("Fruitcake", sabrina);
        c.displayInfo();

        String taylor[] = {"Style","Shake it off","bad blood"};
        MusicAlbum d = new MusicAlbum("1989", taylor);
        d.displayInfo();

        String olivia[] = {"deja vu","good 4 u","traitor"};
        MusicAlbum e = new MusicAlbum("Sour", olivia);
        e.displayInfo();
    }
}
