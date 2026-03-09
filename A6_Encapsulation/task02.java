//2
public class Passenger {
    public static int no_of_passenger=0;   //Static called by .class
    public static double total_fare=0.0;
    public String name;    //normal called by .obj
    public double fare;
    public double distance;
    public double bw;
    
    public Passenger(String name, double distance){
      this.name=name;
      this.fare=(20*distance);
      total_fare+= fare;
      no_of_passenger++;
    }
    
    public void passengerDetails(){
      System.out.println("Name: " + name);
      System.out.println("Fare: " + fare);
    }
    
    
     public void storeBaggageWeight(double bw){
      this.fare=fare + (10*bw);
      total_fare+= 10*bw;
    }

}
