
//8
public class KKTea extends Tea{
  public static int count;
  public static int reg_count;
  public static int flav_count; //Initialized here to print
  
  public int weight;
  public int bag;
  
  public KKTea(int price, int bag){
    super( "KKRegular Tea" , price);
    this.bag=bag;
    weight= bag*2;
  }
  
  
  
  public void productDetail(){
    System.out.printf("Name: %s, Price: %d\n", name, price);
    System.out.println("Status: " + status);
    System.out.printf("Weight: %d, Tea Bags: %d\n", weight, bag);
  }
  
  
  public static void updateSoldStatusRegular(KKTea t){   //important
    t.status=true;
    count++;
    reg_count++;
  }
  
  
  
  public static void totalSales(){   //static type
    System.out.println("Total Sales: " + count);
    System.out.println("KK Regular Tea: "+ reg_count);
    if(flav_count>0){
    System.out.println("KK Flavoured Tea: "+ flav_count);
    }
  }
  
  
}




public class KKFlavouredTea extends KKTea{
  
  public KKFlavouredTea(String name, int price, int bag){
    super(price, bag);
    super.name=name;
  }
  
  public void productDetail(){
    System.out.printf("Name: %s, Price: %d\n", name, price);
    System.out.println("Status: " + status);
    System.out.printf("Weight: %d, Tea Bags: %d\n", weight, bag);
  }
  
  
  public static void updateSoldStatusFlavoured(KKTea t){
    t.status=true;
    count++;
    flav_count++;
  }
  
  
  //totalSales() not created here as the question is (.parent)
}

