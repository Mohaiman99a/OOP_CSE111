//2
public class CheckingAccount extends Account{
  public static int count;
  
    public CheckingAccount(){
       super(0.0);
    count++; 
  }
  
  public CheckingAccount(double balance){
    super(balance);                                                //super.balance=balance would work if non parameter const was present
    count++;
  }
  
    //showBalance() already in parent class tai lagbe na
  
}
