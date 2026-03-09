//6
public class Developer extends Employee{
  public String language;
  public double final_sal;
  
  public Developer(String name, double baseSalary, int hoursWorked, String a){
    super(name, baseSalary, hoursWorked); //Method e sender r type lage na
    language=a;
}
  
  
   public void calculateSalary(){
      if(language.equals("Java")){
      setBaseSalary(getBaseSalary() + 700); //Careful for Quiz
    }
      final_sal=getBaseSalary();
   }
  
  public void displayInfo(){
    System.out.println("Name: " + name);
    System.out.println("Base Salary: $" + getBaseSalary() );
    System.out.println("Language: " + language);
    System.out.println("Final Salary: $" + final_sal);
  }
  
  
  
}




public class Manager extends Employee{
  public double bonus;
  public double final_sal;
  
  public Manager(String name, double baseSalary, int hoursWorked, int bonus){
    super(name, baseSalary, hoursWorked);
    if(getHoursWorked()>40){
    this.bonus= (double)bonus;
  }
}
  
  
   public void calculateSalary(){
     final_sal= getBaseSalary() + (bonus* getBaseSalary()/100);  
   }
  
  public void displayInfo(){
    System.out.println("Name: " + name);
    System.out.println("Base Salary: $" + getBaseSalary() );
    System.out.println("Work Hours: " + getHoursWorked());
    System.out.println("Bonus: " + bonus + "%");
    System.out.println("Final Salary: $" + final_sal);
  }
  
  
  public void requestIncrement(int z){
    if(getHoursWorked()>100){
      setBaseSalary(getBaseSalary() + z);
      System.out.println("$" + z + " Increment approved.");
    }
    
     else if(getHoursWorked()>80){
       int a=(int)(z/2);
       setBaseSalary(getBaseSalary() + (z/2));
      System.out.println("$" + a + " Increment approved.");
    }
     
     else{
       System.out.println("Increment denied.");
     }
  }
  
}
