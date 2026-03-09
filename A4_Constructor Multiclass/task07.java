//7
//Design class 1
public class BracuStudent {
   public String name;
   public String destination;
   public boolean pass;
   

   public BracuStudent(String a, String b){
     this.name=a;
     this.destination=b;
   }
   
   

   public void getPass(){
     pass=true;
   }
   
   

   public void updateHome(String destination){
     this.destination= destination;
   }
   


   public void showDetails(){
     System.out.println("Student Name: " + name);
     System.out.println("Lives in " + destination);
     System.out.println("Have Bus Pass? " + pass);
   }
}






//Design class 2
public class BracuBus {
  public String route;
  public int count;
  public int max_count=2;
  public String[] passenger;
  


  public BracuBus (String route){
    this.route=route;
    passenger= new String[max_count]; 
  }
  
  public BracuBus (String route, int max){
    this.route=route;
    this.max_count= max;
    passenger= new String[max_count]; 
  }
  
  
  
  
  public void showDetails(){
    System.out.println("Bus Route: " + route);
    System.out.println("Passenger Count: " + count + "(Max: " + max_count + ")");
    System.out.println("Passengers on Board: ");
    for(int i=0; i<count; i++){
      System.out.print(passenger[i] + " ");
    }
    System.out.print(" ");
  }
  
  
  
  //board-1
  public void board(){
    if(count==0){
      System.out.println("No passengers");
    }
  }
  

//board-2
  public void board(BracuStudent s){
    
    if(count>=max_count) {
      System.out.println("Bus is full!");
    }
    
    else{
      if(this.route==s.destination && s.pass==true ){
        passenger[count]=s.name;
        count++;
        System.out.println(s.name + " boarded the bus.");
      }
      
      else if(this.route!=s.destination && s.pass==true ){
        System.out.println("You got on the wrong bus!");
      }
      
      else if (s.pass==false){
        System.out.println("You don't have a bus pass!");
      }
    }
  }
  
  
  
  //board-3
  public void board(BracuStudent s1, BracuStudent s2){
    board(s1);
    board(s2);
  }
  
}
