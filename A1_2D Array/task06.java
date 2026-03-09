//6
import java.util.Scanner;
public class Task6{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
  
    System.out.print("N = ");
    int n=sc.nextInt();
    int[] arr1= new int[n];
    
    boolean[] arr2= new boolean[n];     //check if counted
    
    
    //Input
    for(int i=0; i<n; i++){
      arr1[i] = sc.nextInt();
    }
    
    
    //Counting
    for(int i=0; i<arr1.length; i++){
      int count=1;   // First count
      
      if(arr2[i]==false){
        
        for(int j=i+1; j<n; j++){
          if(arr1[i]== arr1[j]){
            count++;
            arr2[j]= true;
          }
        }
        
        System.out.println(arr1[i] +   " - " + count + " times");
      }
      
      else{
        continue;
      }
    }
  }
}
