///7
public class Student{
  public String name;
  public double cgpa;
  public String dept;

  public static int total_std;   //Type don’t forget
  public static int cse_std;
  public static int other_std;
  
  public Student (String name, double cgpa){
    this.name=name;
    this.cgpa=cgpa;
    dept= "CSE";
    cse_std++;
    total_std++;
  }
  
  
    public Student (String name, double cgpa, String dept){
    this.name=name;
    this.cgpa=cgpa;
    this.dept= dept;
    other_std++;
    total_std++;
  }
  
    
    public void individualDetail(){
      System.out.println("ID: " + total_std);
      System.out.println("Name: " + name);
      System.out.println("CGPA: " + cgpa);
      System.out.println("Department: " + dept);
    }
    
    
    public static void printDetails(){
      System.out.println("Total Student(s): " + total_std);
      System.out.println("CSE Student(s): " + cse_std);
      System.out.println("Other Department Student(s): " + other_std);
    }
  
  
}
