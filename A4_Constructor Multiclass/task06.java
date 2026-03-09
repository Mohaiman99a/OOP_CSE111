//6
//Design class for teacher
public class Teacher{
  public String name;
  public String initial;
  public String[] course= new String[3];
  public int count;    //String nile count nitei hobe
  
  
  public Teacher(String name, String initial){
    this.name=name;
    this.initial=initial;
    System.out.println("A new teacher has been created");
  }
  
  
  public void printDetail(){
    System.out.println("Name: " + name);
    System.out.println("Initial: " + initial);
    System.out.println("List of courses: ");
    for(int i=0; i<count; i++){
      System.out.println(course[i]);
    }
  }
    
    public void addCourse(Course c){ 
      course[count]= c.name;
      count++;
    }
  }



//Design class for course
public class Course{
  public String name;
  
  public Course(String name){
    this.name=name;
  }
}
