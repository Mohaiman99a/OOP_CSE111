//8
public class Reader{
  public String name;
  public int capacity=0;
  public String[] books;
  public int count;
  
  
  public String createReader(String a, int b){
    name=a;
    capacity=b;
    books= new String[b];
    return "A new reader is created!";
  }
  
  
  
  public void readerInfo(){
    System.out.println("Name: " + name);
    System.out.println("Capacity: " + capacity);
    System.out.println("Books: ");
    if (count==0){
      System.out.println("No books added yet");
    }
    
    else{
      for(int i=0; i<count; i++){
        System.out.println("Book " + (i+1) + ": " + books[i]);
      }  
    }
  }
  
  
  
  
  public void addBook(String ab){
    if(count<capacity){
       books[count]=ab;       //No loop while inputting value
       count++;
    }
    
    else if(count>=capacity){
      System.out.println("No more capacity");
    }
  }
}
