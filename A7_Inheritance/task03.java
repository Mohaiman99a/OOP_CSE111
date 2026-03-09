//3

public class Dog extends Animal {
  public String breed;
  
  public Dog(String name, int age, String color, String breed){
    super(name, age, color);
    this.breed=breed;
  }
  
    public String info(){
     return "Name: "+name+"\nAge: "+age+"\nColor: "+color+"\n" + "Breed: "+breed+"\n";
  }
    
    
      public void makeSound(){
      System.out.println(color+ " Buddy color is barking");
    }
    
  }






public class Cat extends Animal {
  public String breed;
  
  public Cat(String name, int age, String color, String breed){
    super(name, age, color);
    this.breed=breed;
  }
  
  
  public String info(){
   return "Name: "+name+"\nAge: "+age+"\nColor: "+color+"\n" + "Breed: "+breed+"\n";
  }
  
  
  public void makeSound(){
      System.out.println(color+ " Kitty is meowing");
    }

  }
