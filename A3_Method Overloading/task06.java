//6
public class Student{
  public String name= "Not Set";
  public String dept= "CSE";
  public double cgpa=0.0;
  public int credit=9;
  public String scholar= "Not Set";
  
  public void showDetails(){
    System.out.println("Name: " + name);
    System.out.println("Department: " + dept);
    System.out.println("CGPA: " + cgpa);
    System.out.println("Credits: " + credit);
    System.out.println("Scholarship Status: " + scholar);
  }
  
  
  public void updateDetails(String a, double b, int c){
    name=a;
    cgpa=b;
    credit=c;
  }
  
  
  public void updateDetails(String a, double b){
    name=a;
    cgpa=b;
  }
  
  
  public void updateDetails(String a, double b, int c, String d){
    name=a;
    cgpa=b;
    credit=c;
    scholar=d;
  }
  
  
  
  public void checkScholarshipEligibility(){
    if(cgpa>= 3.5 && credit>10){
      scholar= "Merit based";
      System.out.println(name + " is eligible for Merit Based scholarship");
    }
    
    
    
    else if(cgpa>= 3.5 && cgpa<3.7){
      scholar= "Need based";
      System.out.println(name + " is eligible for Merit based scholarship");
    }
    
    else if(cgpa>=.7){
      scholar= "Merit based";
      System.out.println(name + " is eligible for median based scholarship");
    }
  }
}
