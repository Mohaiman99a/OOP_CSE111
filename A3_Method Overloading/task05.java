//5

public class TaxiLagbe{
  public String num;
  public String area;
  public int count;
  public int fare;
  public String[] list= new String[4];
  
  
  //To print
  public void printDetails(){
    System.out.println("Taxi number: " + num);
    System.out.println("This taxi can cover " + area + " area");
    System.out.println("Total Passenger: " + count);
    System.out.println("Passenger Lists: ");
    
    if(count>0){
      for(int i=0; i<count; i++){
        System.out.println(list[i]);
      }
    }
    
    System.out.println("Total collected fare: " + fare +" Taka");
  }
  
  
  
  //To store taxi name
  public void storeInfo(String a, String b){
    num=a;
    area=b;
  }
  
  //to add passanger
  public void addPassenger(String a, int b){
      if(count<list.length){
        System.out.println("Dear " + a + "!  Welcome to TaxiLagbe");
        fare=fare+b;
        count++;
        
      for(int i=0; i<count; i++){
        list[i]=a;
      }
   }
  }
      
      
    //to add two passanger
  public void addPassenger(String a, int b,String c, int d){
      if(count-1<list.length){
        System.out.println("Dear " + a + "!  Welcome to TaxiLagbe");
        System.out.println("Dear " + c + "!  Welcome to TaxiLagbe");
        
        fare=fare+b+d;
        count=count+2;
        
      for(int i=0; i<count; i++){
        list[i]=a;
        list[i+1]=a;
      }
   }
  }
      
  }
