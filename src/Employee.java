public class Employee extends Person{
    int empCode;
    String destination;
    float salary;

    public Employee(String name, int age, Address address, int empCode, String destination, float salary) {
        super(name, age, address);
        this.empCode = empCode;
        this.destination = destination;
        this.salary = salary;
    }

    public void applyForLeave(){
        System.out.println("apply for leave");
    }

    public int getEmpCode() {
        return empCode;
    }

    public void setEmpCode(int empCode) {
        this.empCode = empCode;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Employee Code: " + empCode);
        System.out.println("Destination: " + destination);
        System.out.println("Salary: " + salary);
    }
}
