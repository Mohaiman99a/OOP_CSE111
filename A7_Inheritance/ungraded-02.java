//2
public class ScienceExam extends Exam{
  public String[] sub=new String[5];
  public int count=2;
  
  public ScienceExam(int marks, int time, String sub1, String sub2){
    super(marks ); //time nae na
      this.time= time;
      sub[count]=sub1;
      count++;
      sub[count]=sub2;
      count++;
  }
  
  
    public ScienceExam(int marks, int time, String sub1, String sub2, String sub3){
    super(marks );
      this.time= time;
      sub[count]=sub1;
      count++;
      sub[count]=sub2;
      count++;
      sub[count]=sub3;
      count++;
  }
  
  
  public String examSyllabus(){
    System.out.println(super.examSyllabus());
    for(int i=2; i<count; i++){
      if(i< count-1){
      System.out.print(sub[i] + ", ");
      }
      else{
        System.out.print(sub[i]);
      }
    }
    return " ";
  }
  
  
  public String examParts(){
    System.out.print(super.examParts());
    for(int i=2; i<count; i++){
      System.out.println("Part " + i + " - " + sub[i]);
    } 
    return " ";
  }
  
  public String toString(){  
    System.out.print("Marks: " + marks + "Time: " + time + " minutes Number of Parts: " + count);
    return " ";
  }
  
}

