//5
import java.util.Arrays;
import java.util.Scanner;

public class Task5{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    
    //Array creation and taking input
    System.out.print("Enter the length of the array: ");
    int size=sc.nextInt();
    int[] arr = new int[size];
    
    
    int i=0;
    while (i<size){
      arr[i]= sc.nextInt();
      i++;
    }
    
    
    //Reversing
    int start= 0;
    int end=size-1;
    int temp=0;
    
    while(start<end){
      temp=arr[start];
      arr[start] = arr[end];
      arr[end]=temp;
      
      start++;
      end--;
    }
    
    
    //Printing
    int s=0;
    while(s<size){
      System.out.print(arr[s] +" ");
      s++;
    }
    
    System.out.println();
    
  }
}
