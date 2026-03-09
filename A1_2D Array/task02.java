//2
import java.util.Scanner;
public class Task2{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    int a= sc.nextInt();
    int b = sc.nextInt();
    
    int start, end;
    int prime=0;
    
    //Check which input is larger
    if(a>b){
      start=b;
      end=a;
    }
    
     else{
      start=a;
      end=b;
    }
    
     
     //Count prime numbers
          
    for(int i=start; i<=end; i++){
      int count=0;
      
      for(int j=1; j<=i; j++){    //j start with1
        if(i%j==0){
          count++;
        }
      }
      
      if(count==2){
        prime++;
      }
    }
    
    System.out.println("There are " + prime + " prime numbers between " + start + " and " + end + ".");
    
  }
}
