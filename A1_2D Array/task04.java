//4
import java.util.Scanner;
public class Task4{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
  
    
    String x= sc.nextLine();
    int len=x.length();
    String temp= "";
    
    
    //Finding the previous alphabet  
    for(int i=0; i<len; i++){
      char a= x.charAt(i);
         
      
        if(a=='a'){
          temp = temp+ (char)(a+25);        //a changes to z
          }
        
        else if(a>='b' && a<='z'){
          temp = temp + (char)(a-1);
        }
          
    }
    
    //Print output
      System.out.print(temp);
  }
}
