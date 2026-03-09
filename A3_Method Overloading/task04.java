//4
public class Library{
  public int max;
  public int books;
  public String[] arr1;
  
  public void setBookCapacity(int n){
    max=n;
    arr1= new String[max];
  }
  
  
  //To add books
  public void addBook(String s){
    if(books<max){
    System.out.println("Book '" + s + "' added to the library");
    arr1[books]=s;
    books++;
    }
    
    else if(books>=max){
     System.out.println("Maximum capacity exceeds. You can't add more than " + max + " books");
    }
    
  }
    
  
//Print output
  public void printDetail(){
    System.out.println("Maximum Capacity: " + max);
    System.out.println("Total Books: " + books);
    if(books>0){
      System.out.println("Book list:");
      for(int i=0; i<books; i++){
        System.out.println(arr1[i]);
      }
    }
  
  }
}
