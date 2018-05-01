//Christian Blair
// Here we see class Employee inheriting from the Person class, and also 
// Overriding the checkName method to display an employee variant
public class Employee extends Person {
    public long socialSecurityNumber;

    // Here we see the checkName method from the Person class, being overriden
    // to say something different
    void checkName() {
        System.out.println("This Employees name is " + name);
    }

    public static void main(String[] args) {
        Employee George = new Employee();
        Employee Mike = new Employee();
        Mike.name = "Mike";
        George.name = "George";
        George.checkName();
    }
}