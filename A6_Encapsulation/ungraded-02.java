//2(Ungraded)
public class Travel{
  private static int count;
  private String source;
  private String destination;
  private int time=1;
  
  public static int getCount(){
    return count;
  }
  
  public Travel(String source, String destination){
    this.source=source;
    this.destination=destination;
    count++;
  }
  
  public String displayTravelInfo(){
    System.out.println("Source: " +source);
    System.out.println("Destination: " +destination);
    String a= time + ":00";
    return a;
  }
  
  public void setTime(int a){
    time = a;
  }
  
  public void setDestination(String a){
    destination=a;
  }
  
  public void setSource(String a){
    source=a;
  }
  
}
