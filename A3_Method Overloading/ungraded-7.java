//7
public class Movie{
  public String name;
  public String director;
  public double rating;
  public String[] actor= new String[3];
  public int actor_count;
  
  public void setMovieDetails(String a, String b, double c){
    name=a;
    director=b;
    rating=c;
  }
  
   public void setMovieDetails(String a, String b){
    name=a;
    director=b;
  }
   
   
    public void updateRating(double c){
    rating=c;
    System.out.println("Updated rating of \"" + c + " \" to " +name);
  }
  
  
   public void addActors(String a, String b, String c){
     addActors(a);
     addActors(b);
     addActors(c);
  }
   
  public void addActors(String a, String b){
     addActors(a);
     addActors(b);
  }
  
  
   public void addActors(String a){
    actor[actor_count]=a;
    System.out.println("Added actor \"" + a + "\" to " +name);
    actor_count=actor_count +1;
  }
  
   
   public void showInfo(){
    System.out.println("Title: " + name);
    System.out.println("Director: " + director);
    System.out.println("Rating: " + rating);
    System.out.print("Actors: ");
    for(int i=0; i<actor_count; i++){
      if(i<actor_count-1){
      System.out.print(actor[i] + " ," );
      }
      else{
      System.out.print(actor[i]);
      }
      System.out.println();
    }
    
  }
}

