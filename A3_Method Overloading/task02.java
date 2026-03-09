//2

public class Shape{
  public String name;
  public int s1;
  public int s2;
  public double s3;
  public double s4;
  public double area;
  
  
    public String details(){
    System.out.println("Shape Name: " + name);
    return "Area: " + area;
  }
  
  
  
  //For Circle
  public void setParameters(String a, int b){
    name=a;
    s1= b;
    area= (3.1416*b*b);
  }
  
  
//For Triangle
  public void setParameters(String a, int b, int c){
    name=a;
    s1= b;
    s2=c;
    area=0.5*(b*c);
    
  }
  
  
//For Rectangle
  public void setParameters(String a, double b, double c){
    name=a;
    s3= b;
    s4=c;
    area=(b*c);
  }
  
}
