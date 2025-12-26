package Assignment_UN;

public class Manager extends Employee {

    private String department;

    public Manager() {
    }

    public Manager(String department, int ID, int salary, String name, int age) {
        super(ID, salary, name, age);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Manager{" + "department=" + department + '}';
    }

}
