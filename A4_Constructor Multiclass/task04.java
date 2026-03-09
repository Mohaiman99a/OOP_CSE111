//4
public class Student {
  public int id;
  public double cg;
  public String[] course= new String[4];
  public int count;
  
  
  
  //Constructor1 
  public Student(int id){
    this.id=id;
    System.out.println("A student with ID " + id + "  has been created.");
  }
  
  
  //Constructor 2
    public Student(int id, double cg){
    this.id=id;
    this.cg=cg;
    System.out.println("A student with ID " + id + " and cgpa " + cg + "  has been created.");
     
    if(cg<3){
      course=new String[3];
      }
    }
    
    
    
    
    //Store cg and id
    public void storeCG(double cg){
    this.cg=cg;
       if(cg<3){
      course=new String[3];
       }
  }
    
    public void storeID(int id){
    this.id=id;
    }
  
  
  
  //Add Course
  public void addCourse(String course){
    if(cg==0){
      System.out.println("Failed to add " + course);
      System.out.println("Set CG first");
    }
    
    else if(cg<3){
          if(count<3){     
          this.course[count]=course;
          count++;
          }
         else{
         System.out.println("Failed to add "+ course);
         System.out.println("CG is low. Can't add more than 3 courses.");
          }
    }
      
      
    else if(cg>=3){
        if(count<4){
        this.course[count]=course;
        count++;
        }
      
        else{
        System.out.println("Failed to add "+ course);
        System.out.println("Maximum 4 courses allowed.");
        }
    }
  }  

  
    
    
    
    //Add course through array
    public void addCourse(String[] course2){
         for(int i=0; i< course2.length; i++){   //Loop doesn't end with count
         addCourse(course2[i]);
      }
    }

    
    
    //Remove course
    public void removeAllCourse(){
      for(int i=0; i<count; i++){
        course[i]="null";
      }
      count=0;
    }
    
    
    
    //Print
    public void showAdvisee(){
      System.out.println("Student ID: " + id + ", CGPA: " + cg);
      System.out.println("Added courses are: ");
      
      if(count!=0){
      for(int i=0; i<count; i++){
        System.out.print(course[i] + " ");
      }
      System.out.println();
      }
      
      else{
        System.out.println("No courses added.");
      }
    }
    
  }
