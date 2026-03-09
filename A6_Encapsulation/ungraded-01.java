//1(ungraded)

public class SultansDine{
  public static int n_branch;
  public static int total_sell;
  public static String[] info=new String[4];
  
  public String name;
  public int branch_sell;
  public double per_sell;
  
  
  public SultansDine(String name){
    this.name=name;
    n_branch++;
  }


  
  public void sellQuantity(int sellQuantity){
    if(sellQuantity < 10){
      branch_sell = sellQuantity * 300;
    }
    else if (sellQuantity < 20){
      branch_sell = sellQuantity * 350;
    }
    else{
      branch_sell = sellQuantity * 400;
    }
    
    total_sell+=branch_sell;
  }
  
  
  public void branchInformation(){
    System.out.println("Branch Name: " +name);
    System.out.println("Branch Sell: " +branch_sell);
    //important
    per_sell= (branch_sell / (double) total_sell)*100;
    info[n_branch-1] =  "Branch Name: " + name + ", Branch Sell: " + branch_sell + " Taka\nBranch consists of total sells " + String.format("%.2f", per_sell) + " ";
  }
  
  
  public static void details(){
    System.out.println("Total Number of branch(s): " + n_branch);
    System.out.println("Total Sell:  " + total_sell + " Taka");
    
    if(n_branch!=0){
      for(int i=0; i<n_branch; i++){
        System.out.println(info[i]);
      }
    }
  }
}
