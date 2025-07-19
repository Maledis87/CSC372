package Module1;

public class EmployeeTest {
    public static void main(String[] args) {
        // Create a Manager object
        Manager mgr = new Manager();
        mgr.setFirstName("Jordan");
        mgr.setLastName("Smith");
        mgr.setEmployeeID(1001);
        mgr.salary = 85000.00;
        mgr.setDepartment("Engineering");

        // Display manager summary
        mgr.employeeSummary();
    }
}