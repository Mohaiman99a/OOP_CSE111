//5
public class Triangle{
  public int side1;
  public int side2;
  public int side3;
  public int peri;
  public String s;
  
  public void updateSides(int a, int b, int c){
    side1=a;
    side2=b;
    side3=c;
  }
  
  public void triangleDetails(){
    System.out.printf("Three sides of the triangle are: %d, %d, %d\n", side1, side2, side3);
    peri= (side1 + side2 + side3);
    System.out.println("Perimeter: " + peri);
  }
  
  public String printTriangleType(){
    if(side1==side2 && side2==side3){
      s= "This is an Equilateral Triangle.";
    }
    
    else if( side1!=side2 && side2!=side3  && side3!=side1 ){
      s= "This is a Scalene Triangle.";
    }
    
    else if( side1==side2 || side2==side3 || side3==side1 ){
      s= "This is a Isosceles Triangle.";
    }
    
    return s;
  }
  
  
  public void compareTrinagles(Triangle tri2){
    
    int peri2=tri2.side1+ tri2.side2+ tri2.side3;
    
    



    //this as outer object is compared to new object
    if(this ==tri2){         
      System.out.println("These two triangle objects have the same address.");
    } 
    
    
    else{
      if( this.side1==tri2.side1 && this.side2==tri2.side2 && this.side3==tri2.side3 ){
        System.out.println("Addresses are different but the sides of the triangles are equal.");
      }
      
      else if(peri==peri2){
        System.out.println("Only the perimeter of both triangles is equal.");
      }
          
      else{
        System.out.println("Addresses, length of the sides and perimeter all are different.");
      }
    }
  }
}
