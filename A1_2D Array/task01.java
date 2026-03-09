//1
import java.util.Scanner;

public class Task1{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    double sum=0;
    double avg=0;
    
    int count=0;
    int max=0;
    int min=99999;
    
    
    //Assigning
    for(int i=1; i<=10; i++){
      int x= sc.nextInt();
    
      if(x >0 && x%2!=0){
        
        sum = x+ sum;
        count++;
        
        if(x>max){
          max=x;
        }
        if(x<min){
          min=x;
        }

      }
      
    }
      
    
    //Printing
    if(count ==0){
      System.out.println("No odd positive numbers found");
    }
    
    
    else if(count> 0){
      int sum_int = (int)sum;
      avg=sum/count;
      
      System.out.println("Sum = " + sum_int);
      System.out.println("Minimum = " + min);
      System.out.println("Maximum = " + max);
      System.out.println("Average = " + avg);
    }
  
  }
}
