package Module1;

public class Employee {
    private String firstName;
    private String lastName;
    private int employeeID;
    protected double salary;

    // Constructor initializes salary to zero
    public Employee() {
        this.salary = 0.0;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public double getSalary() {
        return salary;
    }

    // Method to print employee summary
    public void employeeSummary() {
        System.out.println("Employee Summary:");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Employee ID: " + employeeID);
        System.out.printf("Salary: $%.2f%n", salary);
    }
}