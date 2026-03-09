//3 & 4

public class Song{
  public String title;
  public String artist;
  public int length;
  public Song next;      //extra attribute *next*
  
   public Song(){
  }
  
  
  public Song(String title, String artist, int length){
    this.title= title;
    this.artist=artist;
    this.length=length;
    this.next=null;
  }
  
  public void songInfo(){
    System.out.printf("Title: %s \n Artist: %s \n Length: %d minutes\n", title,artist, length);
  }
  
}





public class Playlist{
  public String p_name;
  public Song head;
  public int count=1;
  
  public Playlist(String p_name){
    this.p_name=p_name;
    System.out.println(p_name + " created.");
  }
  
  
  
  
  public void addSong(Song s){
    System.out.println(s.title + " added to " + p_name + ".");
    Song a=new Song(s.title, s.artist, s.length);
    
    if(head==null){
      head=a;
    }
    
    else{
      Song n=head;
      while(n.next!=null){
        n=n.next;
      }
      n.next=a;
    }
  }
  
  
  
  
  public void info(){
    System.out.println(p_name + " has the following songs: ");
    
    if(head!=null){
      Song n=head;
      while(n.next!=null){
        System.out.println("Song-" + count++);
        n.songInfo();
        n=n.next;
      }
      n.songInfo();    //For the last one
    }
    
    else{
      System.out.println("No songs in " + p_name + ".");
    }
  }      
}
