//6
public class Cargo{
  public static double capacity=10.0;
  public static int count_id;
 
  public int id;    //Static int instance e boshbe
  public String contents;
  public double weight;
  public boolean loaded=false;
  
  public Cargo(String contents, double weight){
    this.contents=contents;
    this.weight=weight;
    count_id++;
    id=count_id;
  }
  
  public void details(){
    System.out.printf("Cargo ID: %d, Contents: %s, Weight: %.1f, Loaded: %b", id, contents, weight, loaded);
    System.out.println();
  }
  
  public static double capacity(){   //Extra method to return capacity
    return capacity;
  }
  
  
  public void load(){
    if(weight<capacity){
      System.out.println("Cargo " + id + " loaded for transport.");
      loaded=true;
      capacity=capacity-weight;
    }
    else{
      System.out.println("Cannot load cargo, exceeds weight capacity.");
    }
  }
  
  
  
    public void unload(){
      System.out.println("Cargo " + id + " unloaded.");
      loaded=false;
      capacity=capacity+weight;
  }
  
}
