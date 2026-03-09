//One Compiler
//1
public class Product{
    private String name="Unknown";
    private double price=0.0;
    private int quantity=0;
    
    
    public Product(){
      name="Unknown";
      price=0.0;
      quantity=0;
    }
    
    public Product(String name, double price){
        this.name=name;
        this.price=price;
    }
    
    public double getPrice(){
        return price;
    }
    
        public int getQuantity(){     //get has return
        return quantity;
    }
    
    public void setQuantity(int quantity){    //Set doesn’t have return
        this.quantity=quantity;
    }
    
    
        public void displayInfo(){
        System.out.println("Product Name: " + name);
        System.out.print("Price: $" + price);
    }
    
    
    public void displayInfo(boolean a){
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
        if(a=true){
            System.out.println("Quantity: " + quantity);
        }
    }
    
}
