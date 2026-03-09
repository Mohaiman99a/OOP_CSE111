//7(Ektu beshi hard)
public class CinemexTicket extends MovieTicket {
  private static int total;
  public boolean paid;
  public String status;
  public String type;
  public String genre;
  
  
  //@Contructor method
  public CinemexTicket(String movie, String showtime, String genre, String date){
    super(movie, date, showtime, seatPrices[0]);                   
    this.genre=genre;
    this.type="Regular";
    status= "Not Paid!";
    total++;
  }
  
  public CinemexTicket(String movie, String showtime, String genre, String date, String type){
    super(movie, date, showtime, get_typePrice(type));
    this.genre=genre;
    this.type=type;
    status= "Not Paid!";
    total++;
  }
  
  
  //Extra method as super r age kisu kora jay na
  public static double get_typePrice(String type){    
    for(int i=0; i<seatTypes.length; i++){
      if(type.equals(seatTypes[i])){
        return seatPrices[i];
      }   
    }
    return seatPrices[0];
  }
  

  //Rater price r jonno ticket
    public void calculateTicketPrice(){
    System.out.println("Ticket price is calculated successfully.");
    
    String[] s1= showtime.split(":");
    int n=Integer.parseInt(s1[0]);
    
    if(18<=n && n<=23){
      setPrice(getPrice()+(getPrice()*15)/100);
    }

  }


//Total ticket
  public static int getTotalTickets(){
    return total;
  }
 
  
  //overridden 
  public String toString() {   
    System.out.println("Ticket ID: " + getMovie() + "-" + type.charAt(0) + "-" + total);
     System.out.printf( "Movie: " + getMovie() + "\nShowtime: " + showtime + "\nDate: " + date);
    return  "\nGenre: " + genre + "\nSeat Type: " + type + "\nPrice(tk): " + getPrice()  + "\nStatus: " + status;
    
  }
  
  
  //Confirm korar jonno method
  public String confirmPayment() {
    if(paid=true){
      return " Ticket price is already paid!";
    }
    
    else{
      paid=true;
      return "Payment Successful.";
    }
  }
  
  
  }
