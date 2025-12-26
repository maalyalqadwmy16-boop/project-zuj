package Assignment_UN;

public class test {

    public static void main(String[] args) {

        Person p = new Person();
        p.setName("Yaser");
        p.setAge(22);

        Employee e = new Employee();
        e.setID(101);
        e.setName("Adnan");
        e.setAge(27);
        e.setSalary(2000);

        Manager m = new Manager();
        m.setID(108);
        m.setName("Roaa");
        m.setAge(19);
        m.setSalary(1500);
        m.setDepartment("IT");

    }
}
