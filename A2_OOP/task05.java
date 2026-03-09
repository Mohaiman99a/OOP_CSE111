//5
   public class Course{
     public String Name;
    public String Code;
    public int Credit=0;
    
    
    //Methods to input values
    public void updateDetails(String a, String b, int c){
      Name= a;
      Code= b;
      Credit= c;
    }
    
    public void updateCourse(String ab, String bd, int cf){
      Name= ab;
      Code= bd;
      Credit= cf;
    }
    
    
    
    //Methods to print value
     public void displayCourse(){
       System.out.println("Course Name: " + Name);
       System.out.println("Course Code: " + Code);
       System.out.println("Course Credit:  " + Credit);
    }
     
}
