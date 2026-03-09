//4
public class Circle{
  private double radius;
  private double area;
  public static int count;   //Static as it's called by .class
  
  public Circle(int r){
    radius=(double)r;   //int to double
    count++;
  }
  
  public double getRadius(){
    return radius;
  }
  
    public void setRadius(int r){
    radius= (double)r;
  }
  
   public double area(){
    area=Math.PI*radius*radius;
    return area;
  } 
  
}
