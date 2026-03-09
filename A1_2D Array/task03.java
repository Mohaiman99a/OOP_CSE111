//3
import java.util.Scanner;
public class Task3{
  public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  
    String x= sc.next();
    String y=sc.next();
    String temp= "";   

    //Concatenation
    for(int i=0;i<x.length(); i++){
      char a=x.charAt(i);
      temp= temp+a;
    }
    
    temp= temp+ " ";
    
    for(int i=0;i<y.length(); i++){
      char b=y.charAt(i);
      temp= temp+b;
    }
    
    //Sum
    int sum=0;
    
    for(int i=0; i<temp.length(); i++){
      int c=temp.charAt(i); 
      if(c>'A' && c<'Z'){
      sum= sum+c;
      }
      
       else if(c>'a' && c<'z'){
      sum= sum+c;
      }
    }
    
    System.out.println(temp);
    System.out.println(sum);
    
  }
}
