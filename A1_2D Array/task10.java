//10
import java.util.Scanner;

public class Task9{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    
    int [ ] [ ] arr1 = {{0, 0, 10, 0, -1},
      {0, -1, 0, 0, -1},
      {-1, 0, -1, 0, 0},
      {0, -1, 7, 0, -1},
      {0, -1, 0, -1, 0}
    };
    int row= arr1.length;
    int col= arr1[0].length;
    
    
    //Print initial map
    System.out.println("Initial Map: ");
    
    for(int i=0; i<row; i++){
      for(int j=0;j<col; j++){
        System.out.print(arr1[i][j] + " ");
      }
      System.out.println();
    }
    
    
    
    
    //Find 7
    int play_row=0, play_col=0;
    
    for(int i=0; i<row; i++){
      for(int j=0;j<col; j++){
        if(arr1[i][j]==7){
          play_row=i;
          play_col=j;
        }
      }
    }
    
    
    
    //Change each turn & print
    boolean prin= true;
    
    for(int turn=1; turn<=6; turn++){
      
      if(turn<=5){
        System.out.print("Enter move " + turn + ":");
        String move=sc.nextLine();
        
        
        if(move.equals("UP")){
          play_row--;
        }
        else if(move.equals("DOWN")){
          play_row--;
        }
        else if(move.equals("RIGHT")){
          play_col++;
        }
        else if(move.equals("LEFT")){
          play_col--;
        }
        
        
        
        if((play_row<0 || play_row>=row) || (play_col<0 || play_col>=col)){
          System.out.println("Player fell outside the playing area. Game over!");
          prin=false;
          break;
        }
        
        
        
        if(arr1[play_row][play_col] ==-1){
          System.out.println("Player stepped on mine. Game Over!");
          prin=false;
        }
        
        else if(arr1[play_row][play_col] ==10){
          System.out.println("Treasure found. You win!");
          prin=false;
          
          System.out.println("Final state: ");
          for(int i=0; i<row; i++){
            for(int j=0;j<col; j++){
              if(i==play_row && j==play_col){
                arr1[i][j]=7;
              }
              
              System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
          }
        }
          
          
          
        if(prin==true){
          System.out.println("Current state: ");
          for(int i=0; i<row; i++){
            for(int j=0;j<col; j++){
              if(i==play_row && j==play_col){
                arr1[i][j]=7;
              }
              
              System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
          }
        }
        }
        
        else{
          if(prin==true){
          System.out.println("Out of moves! Game over.");
          }
        }
        
      }
    }
  }
