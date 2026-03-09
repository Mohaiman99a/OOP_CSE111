//3
public class Book{
  public static int total_books_sold;
  public static double total_revenue;
  public String title;
  public double price= 150.0;
  
  public Book(String title, int d){
    this.title=title;
    total_books_sold++;
    rev(d);        //Method to count the price
  }
  
  public void rev(double e){
    this.price=price - (e*price/100);
    total_revenue+=price;
  }
  
  public void bookDetails(){
    System.out.println("Title: "+ title);
    System.out.println("Price after Discount: "+ price +" TK");
  }
}
