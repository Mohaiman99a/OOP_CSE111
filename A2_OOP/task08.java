//8
public class Employee{
  public String name="null";
  public double salary= 30000.0;
  public String designation= "junior";
  public double tax;
  
  
  //Method to print
    public void displayInfo(){
    System.out.println("Employee Name: " + name);
    System.out.println("Employee Salary: " + salary + "Tk");
    System.out.println("Employee Designation: " + designation);
  }
  
    
  //Method to change name
  public void newEmployee(String empl){
    name=empl;
  }
  
  
  //Method to promote employee
  public void promoteEmployee(String a){
    designation=a;
    System.out.println(name + " has been promoted to " + designation);
     
       if(a.equals("senior")){
        salary= 55000.0;
        }
       
       else if(a.equals("lead")){
         salary= 80000.00;
       }
               
        else if(a.equals("manager")){
          salary= 105000.0;
         }
     
         System.out.println("New Salary: " + salary + "Tk");
       }

  
   //Method to find tax
      public void calculateTax(){
        if(salary>30000){
          tax=salary*10/100;
          System.out.println(name + " Tax Amount: " + tax + "Tk");
        }
        
        else if(salary>50000){
          tax=salary*30/100; 
          System.out.println(name + " Tax Amount: " + tax + "Tk");
        }
   
        else if(salary<3000){
          System.out.println("No need to pay tax ");
         }
  }
}
