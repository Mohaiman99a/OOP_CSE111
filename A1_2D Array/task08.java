
//8
import java.util.Scanner;

public class Task8{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    System.out.print("row = ");
    int row= sc.nextInt();
    
    System.out.print("column = ");
    int col= sc.nextInt();
    
    
    //2D Array:
    int[] [] arr2d = new int [row][col];
    
    for(int i=0; i<row; i++){
      for(int j=0; j<col; j++){
        int a= sc.nextInt(); 
        arr2d[i][j]= a;       
      }
      
    }
    
    //Print 2d array
    System.out.println("2D Array:");
     for(int i=0; i<row; i++){
       for(int j=0; j<col; j++){
         System.out.print(arr2d[i][j] + " ");
       }
       System.out.println();
    }
     
     
     //1D Array:
     int[] arr= new int[row * col];
     int indx=0;
     
     for(int i=0; i<row; i++){
       for(int j=0; j<col; j++){
         arr[indx]=arr2d[i][j];
         indx++;
       }
     }
     
     
     //Print 1d array
     System.out.println("1D Array:");
     int s=0;
     while(s<arr.length){
       System.out.print(arr[s]+ " ");
       s++;
     }
     
  }
}
