import java.util.Scanner;

// Christian Blair
// My project that integrates the skills 
// I have learned thus far

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	    Dog spot = new Dog();
	    spot.size = 30;
	    spot.breed = "German Shepherd";
	    System.out.println(spot.breed);
	    Dog spuds = new Dog();
	    spuds.size = 40;
	}

}

class Dog {
		double size;
		String breed;
	
}
