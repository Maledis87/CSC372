package Module1;

public class Employee {
    private String firstName;
    private String lastName;
    private int employeeID;
    protected double salary;

   
    public Employee() {
        this.salary = 0.0;
    }

    // Setters with validation
    public void setFirstName(String firstName) {
        if (firstName == null || firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("First name cannot be empty.");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("Last name cannot be empty.");
        }
        this.lastName = lastName;
    }

    public void setEmployeeID(int employeeID) {
        if (employeeID <= 0) {
            throw new IllegalArgumentException("Employee ID must be positive.");
        }
        this.employeeID = employeeID;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative.");
        }
        this.salary = salary;
    }

 
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getEmployeeID() { return employeeID; }
    public double getSalary() { return salary; }


    public void employeeSummary() {
        System.out.println("Employee Summary:");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Employee ID: " + employeeID);
        System.out.printf("Salary: $%.2f%n", salary);
    }
}
