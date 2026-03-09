//7
import java.util.Scanner;

public class Task7{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    System.out.print("N = ");
    int size1=sc.nextInt();
    
    double[] arr1=new double[size1];
    
    System.out.println("Please enter the elements of the array: ");
    
    
    //Taking input for array elements
    for(int i=0; i<size1; i++){
      arr1[i]= sc.nextDouble();
    }
    
    
    //New array size count
    int size2=1;  //First one already counted
    
    for(int i=1; i<size1; i++){  //i=1 this time, nested loop na cuz porer ta just check
      if(arr1[i]!=arr1[i-1]){
        size2++;
      }
    }
    
    
    //New array
    double[] arr2= new double[size2];
    
    //Elements of new array
    arr2[0]=arr1[0];
    int indx=1;                  //Ekta array ke base kore arekta banale index dhore nite hoy
    
    for(int i=1; i<size1; i++){  
      if(arr1[i]!=arr1[i-1]){
        arr2[indx]=arr1[i];
        indx++;
      }
    }
    
    
    //Printing
    System.out.print("New Array: ");
      
    for(int i=0; i<arr2.length; i++){  
    System.out.print(arr2[i]+ " ");
    }
    
    System.out.println();
    int removed=arr1.length-arr2.length;
    System.out.println("Removed elements : " +removed);
    
  }
}

