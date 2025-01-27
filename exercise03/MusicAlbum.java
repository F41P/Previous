package main.java.org.dii.oop.exercise03;

public class MusicAlbum {
    String albumName;
    String [] song;

    public MusicAlbum(){
        this("Unknown",null);
    }

    public MusicAlbum(String albumName){
        this.albumName = albumName;
    }
    public MusicAlbum(String albumName, String[] song){
        this.song = song;
        this.albumName = albumName;
    }

    public void displayInfo(){
        System.out.println("Album: "+albumName);
        if (song != null) {
            for (int i = 0; i < song.length; i++) {
                System.out.println((i+1)+" "+song[i]);
            }
            System.out.println();
        }
        else {
            System.out.println("No song in this album");
            System.out.println();
        }
    }
}
