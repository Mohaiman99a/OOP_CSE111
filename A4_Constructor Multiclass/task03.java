//3
public class Shape2D {
  public String shape;
  public int side_1;
  public int side_2;
  public int side_3;
  public double area;
  
  
  public Shape2D(){
    shape="Square";
    side_1=5;
    area= side_1* side_1;
    System.out.println("A Square has been created with length: " + side_1);
    
  }
  
  public Shape2D(int a, int b){
    shape="Rectangle";
    side_1=a;
    side_2=b;
    area= side_1* side_2;
    System.out.println("A Rectangle has been created with length: " + side_1 + " and breadth:" + side_2);
  }
  
  
  public Shape2D(int a, int b, String c){
      shape="Triangle";
      side_1=a;
      side_2=b;
      area=0.5* side_1* side_2;
      System.out.println("A Triangle has been created with height: " + side_1 + " and base:"+ side_2);
       }
        
        
    public Shape2D(int a, int b, int c){
      shape="Triangle";
      side_1=a;
      side_2=b;
      side_3=c;
      int s=(a+b+c)/2;
      area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
      System.out.println("A Triangle has been created with sides: " + side_1+", "+ side_2 + ", "+ side_3);
      }    
  
    public void area(){
      //System.out.printf("The area of the " + shape+ " is: %.2f\n" , area);
      System.out.printf("The area of the %s is: %.2f\n" ,shape, area);
    }
    }
