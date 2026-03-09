//9
import java.util.Scanner;

public class Task9{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    
    //1st matrix
    int [ ] [ ] A = {{1,  0,  0,  1},
                       {0,  1,  0,  0},
                       {1,  0,  1,  0},
                       {0,  1,  0,  1}};
    int row= A.length;
    int col= A[0].length;
    
    
    //Check if it's an identity matrix
    int count=0;
    boolean iden_matrix=true;
    
    for(int i=0; i<row; i++){
      for(int j=0; j<A[0].length; j++){
        if(i==j && A[i][j]==1){
          count++;
        }
        
        else if(i!=j && A[i][j]!=0){
          iden_matrix=false;
        }
      }
    }
    
    
    //Print for 1st matrix
    if(count==row && iden_matrix==true){
      System.out.println("Identity Matrix");
    }
    
    else{
      System.out.println("Not an Identity Matrix");
    }
    
    
    
    
    
    
    
    
      //2nd matrix
     int [ ] [ ] A2 = {{1, 0, 0},
                         {0, 1, 0},
                         {0, 0, 1}};
    
    
    //Check if it's an identity matrix
    int count2=0;
    boolean iden_matrix2=true;
    
    for(int i=0; i<A2.length; i++){
      for(int j=0; j<A2[1].length; j++){
        if(i==j && A2[i][j]==1){
          count2++;
        }
        
        else if(i!=j && A2[i][j]!=0){
          iden_matrix2=false;
        }
      }
    }
    
    
    //Print for 2nd matrix
    if(count2==A2.length){
      if(iden_matrix2==true){
      System.out.println("Identity Matrix");
      }
      else{
         System.out.println("Not an Identity Matrix");
      }
    }
    
    else{
      System.out.println("Not an Identity Matrix");
    }
  }
}

