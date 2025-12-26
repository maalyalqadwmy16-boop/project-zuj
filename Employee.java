package Assignment_UN;

public class Employee extends Person {

    private int ID;
    private int salary;

    public Employee() {
    }

    public Employee(int ID, int salary, String name, int age) {
        super(name, age);
        this.ID = ID;
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "ID=" + ID + ", salary=" + salary + '}';
    }

}
