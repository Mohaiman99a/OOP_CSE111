//1
public class MoneyTracker{
  public String name="null";
  public double balance=0.0;
  public double last_a;
  public double last_s;
  
  
  
  public String info(){
    System.out.println("Name: " + name);
    return "Current Balance: " + balance;
  }
  
  
  public void createTracker(String a){
    name=a;
    balance=1.0;
  }
  
  
  
  
  public void income(int a){
    last_a=a;
    balance+=a;
    System.out.println("Balance Updated!");
  }
  
  
  
  
  
  public void expense(int a){
    if(a<=balance){
      last_s=a;
      balance=balance-a;
      System.out.println("Balance Updated.");
      if(balance==0){
        System.out.println("You're broke!");
      }
    }
    
    else if(a>balance){
      System.out.println("Not enough balance.");
    }
  }
  
  
  
  public void showHistory(){
    System.out.println("Last added: " + last_a);
    System.out.println("Last spent: " + last_s);
  }
}
