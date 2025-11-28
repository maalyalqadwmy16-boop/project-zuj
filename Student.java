
public class Student {

    private String name;
    private int studentID;
    private double[] grades;
    private double average;

    public Student() {
    }

    public Student(String name, int studentID, double[] grades) {
        this.name = name;
        this.studentID = studentID;
        this.grades = grades;
        this.average = calculateAvarage();
    }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }

    public double[] getGrades() {
        return grades;
    }

    public double getAverage() {
        return average;
    }

    public double calculateAvarage() {
        double Sum = 0;

        for (int i = 0; i < grades.length; i++) {

            Sum += grades[i];
        }

        double average = Sum / grades.length;

        return average;

    }

   
    public void displayStudentInfo() {
        
        System.out.println("--------------------------------------------");
        System.out.println("Student Name:" + name);
        System.out.println("Student ID:" + studentID);
        
        
        System.out.println("Enter a value of grades:");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i] + "");
 
            System.out.println();   

        }
          
        System.out.println("Average:" + average);

        System.out.println("-------------------------------------------");
    }
}
