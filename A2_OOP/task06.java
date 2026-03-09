//6(design class)
public class Assignment{
  public int tasks= 0;
  public String difficulty;
  public boolean submission = false;
  
  //Method to print
  public void printDetails(){
    System.out.println("Number of tasks: " + tasks);
    System.out.println("Difficulty level: " + difficulty);
    System.out.println("Submission required: " + submission);
  }
  
  
  //Method for optional
  public String makeOptional(){
    String opt;
    
    if(submission==true){
      opt= "Assignment will not require submission";
       return opt;
    }
    
    else{
      opt= "Submission is already not required";
      return opt;
    } 
  }
}
