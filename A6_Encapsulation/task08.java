//8
public class Player{
  public static int total;
  public static int max=11;
  public static String enlist="";
  
  public String name;
  public String country;
  public int j_n;
  
  public Player(String name, String country, int j_n){
    if(total<max){
      this.name=name;
      this.country=country;
      this.j_n=j_n;
      
      if(total==0){
        for(int i=0; i<name.length(); i++){
          char a=name.charAt(i);
          enlist+=a;
        }
      }
      
      
      else{
        enlist+=", ";
        for(int i=0; i<name.length(); i++){
          char a=name.charAt(i);
          enlist+=a;
        }
      }
      total++;
    }
  }
  
  
  public String player_detail(){
    System.out.println("Player Name: " + name);
    System.out.println("Jersey Number: " + j_n);
    return ("Country: " + country);  //return something
  }
  
  public static void  info(){
    System.out.println("Total number of players:  " + total);
    System.out.println("Players enlisted so far: " + enlist);
    
  }
  
}

