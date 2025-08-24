package Module1;

public class Manager extends Employee {
    private String department;

  
    public Manager() {
        super();
    }

    // Setter with validation
    public void setDepartment(String department) {
        if (department == null || department.trim().isEmpty()) {
            throw new IllegalArgumentException("Department cannot be empty.");
        }
        this.department = department;
    }

  
    public String getDepartment() {
        return department;
    }

    @Override
    public void employeeSummary() {
        super.employeeSummary();
        System.out.println("Department: " + department);
    }
}
