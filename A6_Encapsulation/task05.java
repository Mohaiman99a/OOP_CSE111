//5
public class Borrower{
  public static int book_count[] = {3, 3, 3};
  public static String book_name[] = {"Pather Panchali", "Durgesh Nandini", "Anandmath"};        //Dewa na thakle static diye alada banaite hobe


  
  public String name;
  public String[] borrow=new String[3];
  public int count=0;
  public boolean flag=false;
  
  
  public Borrower(String name){
    this.name=name;
  }
  
  
  
  public void borrowBook(String book){
    
    for(int i=0; i<book_name.length; i++){
      if(book.equals(book_name[i])){
        borrow[count]=book;
        count++;
        book_count[i]--;
        flag=true;
      }
    }
    
    if(flag=false){
      System.out.println("This book is not available.");
    }
    
  }
  
  
  
  public static void bookStatus(){           //static type(.class)
    System.out.println("Available Books: ");
    for(int i=0; i<book_name.length; i++){
      System.out.println(book_name[i] + ": " + book_count[i]);
    }
  }
  
  
  
  public static int remainingBooks(String a){      //return static value
    
    for(int i=0; i<book_name.length; i++){
      if(a.equals(book_name[i])){
        return book_count[i];
      }
    }
    
    return 0;
  }
  
  
  
  
  
  public void borrowerDetails(){
    System.out.println("Name: " + name);
    System.out.println("Books Borrowed: ");
    for(int i=0; i<count; i++){
      System.out.println(borrow[i]);
    }
  }
}
