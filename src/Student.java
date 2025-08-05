public class Student extends Person{
    private int roll_no;
    private String grade;


    public Student(String name, int age, Address address, int roll_no, String grade) {
        super(name, age, address);
        this.roll_no = roll_no;
        this.grade = grade;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Roll no.: " + roll_no);
        System.out.println("Grade: " + grade);
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
