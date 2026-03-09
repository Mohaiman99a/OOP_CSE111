//5
public class ComplexNumber extends RealNumber {
  public double imgValue = 1.0;
  
  public ComplexNumber(){
    super();
    super.realValue=1.0;
  }
  
  
    public ComplexNumber(double realValue, double imgValue){
    super(realValue);
    this.imgValue=imgValue;
  }
  
   public String toString(){
        System.out.println( "RealPart: " + realValue);          //super.toString()
        return ("ImaginaryPart: " + imgValue);
    }

    }
