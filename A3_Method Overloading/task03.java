//3
public class Shelf{
  public int capacity;
  public int no_books;
  
  
  public void showDetails(){
    System.out.println("Shelf capacity: " + capacity);
    System.out.println("Number of books: " + no_books);
  }
  
  public void addBooks(int n){
    if(capacity==0){
      System.out.println("Zero capacity. Cannot add books.");
    }
    
    else if((no_books+n) < capacity){
      no_books+=n;
      System.out.println(n + " books added to shelf");
    }
    
    else{
      System.out.println("Exceeds capacity");
    }
    
  }
}

