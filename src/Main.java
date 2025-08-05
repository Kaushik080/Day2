public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Kaushik", 22, new Address("Mumbai", "Maharashtra", 40000), 102, "Dev", 77000f);
        Student st = new Student("Kaushik", 22, new Address("Mumbai", "Maharashtra", 40000), 12, "A");
        System.out.println("Emp details");
        emp.displayInfo();
        System.out.println("Student Details");
        st.displayInfo();
        /*int sum = 0;
        for (String arg: args){
            sum += Integer.parseInt(arg);
        }
        System.out.println("sum: " + sum);*/
    }
}

