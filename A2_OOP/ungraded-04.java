UNGRADED

//4
public class MobilePhone{
  public int contact=0;  //count
  public int capacity=0;
  public String[] name; //Don't find the size yet
  public int[] num; //Method e comma ase tai duita alada array
  
  
  public void setContactCapacity(int a){
    capacity=a;
    name=new String[capacity];
    num=new int[capacity];
  }
  
  
  
  
  public void details(){
    System.out.println("Total Contacts: " + contact);
    System.out.println("Contact List");
    
    for(int i=0; i<contact; i++){         //till contact not capacity
      System.out.println(name[i]+":"+num[i]);
    }
  }
  
  
  
  
  
    public void addContact(String b, int c){
      if(contact<capacity){
      System.out.println("The contact of " + b + " is added.");
      name[contact]=b;
      num[contact]=c;
      contact++;
      }
      
      else{
        System.out.println("Storage Full!!"); //Careful about this
      }
  }
    
    
    
    
    public void makeCall(int d){
      boolean found = false;    //Boolean to check if number exists 
      
      for(int i=0; i<contact; i++){
        if(num[i]==d){
          System.out.println("Calling " + name[i] + "...");
          found= true;
        }
      }
        
        if(found==false){
          System.out.println("Calling " + d +"...");
        }
      }
    
}
