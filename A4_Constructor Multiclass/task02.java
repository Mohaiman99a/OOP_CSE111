//2
public class Toy{
    public String name;
    public int price;
  
  
  public Toy(String a, int b){
    name=a;
    price=b;
    System.out.println("A new toy has been made!");
  }
  
  
  public void updatePrice(int c){
    price=c;
  }
  
  
  public void showPrice(){
    System.out.println("price: " + price + ” Taka”);
  }
  
  public void updateName(String c){
    System.out.println("Changing old name: " +c);
    name=c;
    System.out.println("new name: " +c);
  }
}
