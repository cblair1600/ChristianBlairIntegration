import java.util.Scanner;

// Christian Blair
// My project that integrates the skills that 
// I have learned thus far

// Variables have many types
public class Main {

  public static void main(String[] args) {
    // sysout ctrl + space
    // ctrl + Shift + F to auto format everything
    System.out.println("Welcome to my Project!");
   
    Dog spot = new Dog();
    spot.size = 30;
    spot.breed = "German Shepherd";
    System.out.println(spot.breed);
    Dog spuds = new Dog();
    spuds.size = 40;
    System.out.println("");
  }

}

class Dog {
  double size;
  String breed;

}
