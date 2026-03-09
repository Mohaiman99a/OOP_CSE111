//1
public class BankAccount{
  public int acc_no;
  public String type="Not Set";
  
  
  //Return method
  public String printDetails(){   
    System.out.println("Account No: " + acc_no);
     String s= "Type: " + type;
     return s;
  }
  
  
    public void setInfo(int acc, String ty){
    System.out.println("Account information updated!");
    acc_no=acc;
    type= ty;
  }
}
