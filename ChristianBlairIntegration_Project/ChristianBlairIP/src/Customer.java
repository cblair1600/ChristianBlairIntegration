//Christian Blair
// Here we see class Customer inheriting from the Person class, and also 
// Overriding the checkName method to display an Customer variant
public class Customer extends Person {
    public long customerNumber;
    public long[] invoiceNumbers;

    // Here we see the checkName method from the Person class, being overriden
    // to say something different
    public void checkName() {
        System.out.println("The Customers name is " + name);
    }

    public static void main(String[] args) {
        Customer John = new Customer();
        Customer Mike = new Customer();
        Mike.name = "Mike";
        John.name = "John";
        John.checkName();
    }
}
