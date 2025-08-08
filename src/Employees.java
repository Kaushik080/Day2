public class Employees {
    private String empName;
    private int empID;
    private String role;
    private double salary;

    public Employees(String empName, int empID, String role) {
        this.empName = empName;
        this.empID = empID;
        this.role = role;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employees(String empName, int empID, String role, double salary) {
        this.empName = empName;
        this.empID = empID;
        this.role = role;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "empName='" + empName + '\'' +
                ", empID=" + empID +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                '}';
    }
}
