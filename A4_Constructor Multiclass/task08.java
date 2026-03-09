//8
public class Student{
  public String name;
  public int id;
  public String dept;
  public String email= "null";
  public String password="null";
  public boolean loginStatus= false;
  
    
    
    public Student(String name, int id, String dept){
    this.name=name;
    this.id=id;
    this.dept=dept;
    System.out.println("Student object is created");
  }
}








public class Usis {
  public String[][] studentType= new String[5][4];
  public int totalAdvisee;
  public int maxAdvisee=5;
  
  
//Constructor 
  public Usis(){
    System.out.println("Usis is ready to use!");
  }
  
  public void login(Student s){
    if((s.password).equals("null") || (s.email).equals("null")){
      System.out.println("Email and password need to be set.");
    }
    
    else{
      s.loginStatus=true;
      System.out.println("Login successful");
    }
  }
  
  

//Advising -1
  public void advising(Student s){
    if(s.loginStatus==false){
      System.out.println("Please login to advise courses!");
    }
    
    else if(s.loginStatus==false && studentType[3].equals("null")){
       System.out.println("You haven't selected any courses.");
    } 
  }
  
  
//Advising - 2
  public void advising(Student s, String a, String b, String c, String d){
    System.out.println("You need special approval to take more than 3 courses.");
  }
  

// Advising - 3
  public void advising(Student s, String a, String b, String c){
    System.out.println("Advising successful!");
    studentType[totalAdvisee][0]=s.name;
    studentType[totalAdvisee][1]= s.id + " "; //Quotation int -> String
    studentType[totalAdvisee][2]=s.dept; 
    studentType[totalAdvisee][3]= a+ " " +b+ " " +c;  //No array here
    totalAdvisee++;
  }
  
  

// All advisee
  public void allAdviseeInfo(){
    System.out.println("Total Advisee: " + totalAdvisee);
    for(int i=0; i<=totalAdvisee; i++){
      System.out.printf("Name: %d ID: %\n", studentType[i][0], studentType[i][1]);
      System.out.println("Department: " + studentType[i][2]);
      System.out.println("Advised Courses: ");
      System.out.println(studentType[i][3]);
      System.out.println("==============");
     }
   }
  }

