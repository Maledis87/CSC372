package Module1;

public class Manager extends Employee {
    private String department;

    // Constructor
    public Manager() {
        super(); // calls Employee constructor
    }

    // Setter for department
    public void setDepartment(String department) {
        this.department = department;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

    // Override employeeSummary to include department
    @Override
    public void employeeSummary() {
        super.employeeSummary(); // call parent method
        System.out.println("Department: " + department);
    }
}
