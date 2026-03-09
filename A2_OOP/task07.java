//7
public class CellPhone{
  public String model = "unknown";
  public int count=0;
  public String[] arr1=new String[3];
  
  
  public void storeContact(String a){
    
    if(count<3){   //If statement to check the storage
      arr1[count]= a;
      System.out.println("Contact Stored");
      count++;
    }
    
    else if(count==3){
      System.out.println("Memory full. New contact can't be stored.");
    }  
  }
  

  public void printDetails(){
    
    System.out.println("Phone Model " + model);
    System.out.println("Contacts Stored " + count);
    
    if(count>0){
    System.out.println("Stored Contacts: ");
    
    //Array is taken to print every element
    for(int a=0; a<count; a++){
      System.out.println(arr1[a]);
    }
    
    }
  }
}
