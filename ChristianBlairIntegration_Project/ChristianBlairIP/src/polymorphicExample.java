//Christian Blair
// Now this class creates an object from the Person class
// But in this case, the person is an employee AND customer!
// I can still have him run through both overriden methods of the checkName 
// Method in the two child classes of Person, Employee and Customer. 
public class polymorphicExample extends Person {
    public static void main(String[] args) {
        Person Mike[] = new Person[2];
        Mike[0] = new Employee();
        Mike[1] = new Customer();

        for (int x = 1; x < 2; ++x) {
            Mike[x].checkName();
        }
    }
}
