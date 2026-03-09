//9
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
    System.out.println("Title: " + title);
    System.out.println("Artist: " + artist);
    System.out.println("Length: " + length + " minutes");
  }
  
}






public class Playlist{
  public String name;
  public Song head;
  public int count=0;
  public int count2;
  
  public Playlist(String name){
    this.name=name;
    System.out.println(name + " created.");
  }
  
  
  
  //Add one song after the last one
  public void addSong(Song s){
    System.out.println(s.title + " added to " + name + ".");
    
    Song a=new Song();
    a.title=s.title;
    a.artist=s.artist;
    a.length=s.length;
    a.next=null;
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
    Song a=new Song();
    a.title=s.title;
    a.artist=s.artist;
    a.length=s.length;
    a.next=head;
    head=a;
    count++;
  }
  
  
  
  
  
  //Add song at any position
  public void addSong(Song s, int index){
    
    if(index<=count){
      System.out.println(s.title + " added to " + name + ".");
      Song a=new Song();
      a.title=s.title;
      a.artist=s.artist;
      a.length=s.length;
      a.next=null;
      
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
    System.out.println(name + " has the following songs: ");
    
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
      System.out.println("No songs in " + name + ".");
    }
  }
  
  
  //Play song
  public void playSong(String a){
    boolean found=false;
    
    Song n=head;
    while(n.next!=null){
      if((n.title).equals(a)){
        found=true;
        break;
      }
      
      else{
        n=n.next;
      }
    }
    
    //loop r bahire
    if((n.title).equals(a)){
      found=true;
    }
    
    if(found==false){
      System.out.println(a+" not found in playlist " + name+ ".");
    }
    
    else{
      System.out.println("Playing " +n.title + " by " + n.artist + ".");
    }
    
  }
  
  
  
  //Add song at a particular index
  public void playSong(int index){
    Song n=head;
    
    if(index<=count){
      if(index==0){
        System.out.println("Playing " +(n.next).title + " by " + (n.next).artist + ".");
      }
      
      else{
        for(int i=0; i<index-1; i++){
          n=n.next;
        }
        System.out.println("Playing " +(n.next).title + " by " + (n.next).artist + ".");
      }
    }
    
    else{
      System.out.println("Song at Index " + index + " not found in " + name + ".");
    }
    
  }
  
  
  
  
  public void deleteSong(String a){
    boolean found=false;
    
    Song n=head;
    Song n1=null;
    
    while(n.next!=null && count2<count){
      if((n.title).equals(a)!=false){
        found=true;
        break;
      }
      count2++;
    }
    
    if((n.title).equals(a)){
      found=true;
    }
    
    if(found==false){
      System.out.println(a+" not found in playlist " + name+ ".");
    }
    
    else{
      System.out.println(n.title + " deleted from " + name + ".");
      n1=n.next;
      n.next=n1.next;
    }
  }
  
  
  
  
  public int totalSong(){
    return count;
  }
  
}
