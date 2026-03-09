//1
public class Vaccine{
  private String v_name;
  private String country;
  private int come;
  
  public Vaccine(String v_name , String country, int come){
    this.v_name =v_name;
    this.country=country;
    this.come=come;
  }
  
  public String getName(){
    return v_name;
  }
  
  public void setName(String v_name){
    this.v_name=v_name;
  }
  
  
    public String getCountry(){
    return country;
  }
  
  public void setCountry(String country){
    this.country=country;
  }
 
      public int getCome(){
    return come;
  }
  
  public void setCome(int come){
    this.come=come;
  }  
}





public class Person{
  public String name;
  public int age;
  public String type;
  
  public int count;
  public Vaccine first;       //type vaccine
  public Vaccine second;
  
  public boolean first_g;
   public boolean second_g;
  
  
  
  //constructor
  public Person (String name, int age, String type){
    this.name=name;
    this.age=age;
    this.type=type;
  }
  
  public Person (String name, int age){
    this.name=name;
    this.age=age;
    this.type="General Citizen";
  }
  

  //show detail
  public void showDetail(){
    System.out.printf("Name: %s Age: %d Type: %s\n", name, age,type);
    System.out.println("Vaccine name: "+first.getName());
    
    System.out.print("1st dose:  ");
    if(first_g=true){
     System.out.println("Given");
    }
    
    System.out.print("2nd dose:  ");
    if(second_g=true){
     System.out.println("Given");
    }
    else{
      System.out.printf("Please come after %d days\n",first.getCome());
    }
    
  }
    
    
    
  
  //pushVaccine-1
  public void pushVaccine(Vaccine v){
    if(type.equals("Student")){
      if(count==0){
        first= v;
        System.out.println("1st dose done");
        count++;
        first_g=true;
      }
      
      else if(count==1){
        if((first.getName()).equals(v.getName())){
          second= v;
          System.out.println("2nd dose done");
          count++;
          second_g=true;
            }
           else{
             System.out.printf("Sorry %s, you can’t take 2 different vaccines", name);
           }
        }
      
    else if(count==2){
      System.out.printf("Sorry %s, you already received both doses.\n", name);
    }
    }
 }






 //pushVaccine-2
  public void pushVaccine(Vaccine v, String dose){
    if(type.equals("Student")){
      if(count==0){
        first= v;
        System.out.println("1st dose done");
        count++;
        first_g=true;
      }
      
      else if(count==1){
        if((first.getName()).equals(v.getName())){
          second= v;
          System.out.println("2nd dose done");
          count++;
          second_g=true;
        }
           else{
             System.out.printf("Sorry %s, you can’t take 2 different vaccines", name);
           }
       }
      
    else if(count==2){
      System.out.printf("Sorry %s, you already received both doses.\n", name);
    }
    }
  
  
  
  
  
  
  
  
  else if(type.equals("General Citizen")){
    if(age>25){
       if(count==0){
        first= v;
        System.out.println("1st dose done");
        count++;
        first_g=true;
      }
      
      else if(count==1){
        if((first.getName()).equals(v.getName())){
          second= v;
          System.out.println("2nd dose done");
          count++;
          second_g=true;
        }
           else{
             System.out.printf("Sorry %s, you can’t take 2 different vaccines", name);
           }
       }
      
    else if(count==2){
      System.out.printf("Sorry %s, you already received both doses.\n", name);
    }
    }
    
    else{
      System.out.printf("Sorry %s, Minimum age for taking vaccines is 25 years now.", name);
    }
    
    
  }
  
  
}
  
}
