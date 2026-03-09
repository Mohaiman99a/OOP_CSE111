//2

public class Song{
  public String title;
  public String artist;
  public int length;
  public Song next;      //extra attribute *next*
  
  
  public Song(String title, String artist, int length){
    this.title= title;
    this.artist=artist;
    this.length=length;
    this.next=null;
  }
  
  public void songInfo(){
    System.out.println("Title: " + title);
    System.out.println("Artist: " + artist);
    System.out.println("Length: " + length + " minutes");
  }
  
}






public class Playlist{
  public String playlist;
  
  public Playlist(String playlist){
    this.playlist=playlist;
    System.out.println("First Playlist created.");
  }
}
