//5

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
  public int count=0;
  
  public Playlist(String p_name){
    this.p_name=p_name;
    System.out.println(p_name + " created.");
  }
  
  
  
  //Add one song after the last one
  public void addSong(Song s){
    System.out.println(s.title + " added to " + p_name + ".");
    
    Song a= new Song(s.title, s.artist, s.length);
    count++;
    
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
  
  
  
  //Add song before the first
  public void addAtStart(Song s){
    Song a=new Song(s.title, s.artist, s.length);
    a.next=head;
    head=a;
    count++;
  }
  
  
  
  
  
  //Add song at any position
  public void addSong(Song s, int index){
    
    if(index<=count){
    System.out.println(s.title + " added to " + p_name + ".");
    Song a=new Song(s.title, s.artist, s.length);
    
    if(index==0){
      addAtStart(s);
    }
    
    else{
    Song n=head;
    for(int i=0; i<index-1; i++){
      n=n.next;
    }
    a.next=n.next;
    n.next=a;
  }
    }
    
    else{
        System.out.println("Cannot add song to Index " + index+".");
      }
    }
  
  
  
  
  
  
  
  //Print
  public void info(){
    count=1;
    System.out.println(p_name + " has the following songs: ");
    
    if(head!=null){
      Song n=head;
      while(n.next!=null){
        System.out.println("Song-" + count++);
        System.out.println("Title: " + n.title);
        System.out.println("Artist: " + n.artist);
        System.out.printf("Length: %d minutes\n", n.length);
        n=n.next;
      }
      System.out.println("Song-" + count++);
      System.out.println("Title: " + n.title);
      System.out.println("Artist: " + n.artist);
      System.out.printf("Length: %d minutes\n", n.length);
    }
    
    else{
      System.out.println("No songs in " + p_name + ".");
    }
  }    
}

