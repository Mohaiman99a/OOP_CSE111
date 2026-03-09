//7
public class Cart{
  public int c_num;
  public String[] item= new String[3] ;
  public double[] price= new double[3] ;
  public int count; 
  public double total;
  public double discount;
  
  
  
  public void create_cart(int a){
    c_num= a;
  }
  
  
  
  
  
  public void addItem(String a, double b){
    if(count<3){
      item[count]= a;
      price[count]=b;
      
      total= total+b;
      count++;
      
      System.out.println(a + " added to cart " + c_num);
      System.out.println("You have " + count + " item(s) in your cart now." );
    }
    
    else{
      System.out.println("You already have 3 items on your cart");
    }
  }
  
  
  
  
  
  public void addItem(double b, String a){
    if(count<3){
      item[count]= a;
      price[count]=b;
      
      total= total+b;
      count++;
      
      System.out.println(a + " added to cart " + c_num);
      System.out.println("You have " + count + " item(s) in your cart now." );
    }
    
    else{
      System.out.println("You already have 3 items on your cart");
    }
  }
  
  
  
  
  
  public void cartDetails(){
    System.out.println("Your cart (c" +c_num+")");
    for(int i=0; i<count; i++){
      System.out.print(item[i] + " - ");
      System.out.println(price[i]);
    }
    
    System.out.println("Discount Applied: " + discount + "%");
    System.out.println("Total price: " + total);
    
  }
  
  
  
  
  public void giveDiscount(double a){
    discount=a;
    total=total - (total*a)/100;
  }
}

