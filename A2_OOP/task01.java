//1a
//Tester class
public class Task1a{
  public static void main(String[] args){
    University ver1= new University();
    University ver2= new University();
    
    //Print the location
    System.out.println(ver1);
    System.out.println(ver2); 
    //No, the location of the object aren't same
    
    
    //Printing the instance variable
    System.out.println(ver1.name);
    System.out.println(ver1.country);
    System.out.println(ver2.name);
    System.out.println(ver2.country);
    
  }
}




//1b
//Tester class
public class Task1{
  public static void main(String[] args){
    University ver1= new University();
    University ver2= new University();
    
    ver1.name =  "Imperial College London";
    ver1.country = "England";
    ver2.name =  "Brac University";
    ver2.country = "Bangladesh";

      
    System.out.println(ver1.name);
    System.out.println(ver1.country);
    System.out.println(ver2.name);
    System.out.println(ver2.country);
    //Instance variable of both object has changed but they aren't the same
    
  }
}
