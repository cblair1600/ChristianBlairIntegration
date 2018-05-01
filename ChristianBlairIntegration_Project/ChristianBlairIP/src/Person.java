//Christian Blair
// This class demonstrates inheritance with two child classes Employee and 
// Customer. 
// This acts as a parent class for the respective two and will bring these 
// aspects over into the children. This class also creates a method
// that can be overriden to customize for each situation. This could be an 
// example on code to work for a business software keeping track of people. 
public class Person {
    public String name;
    public String address;

    void checkName() {
        System.out.println(name);

    }
}
