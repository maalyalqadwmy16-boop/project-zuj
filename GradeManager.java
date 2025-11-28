
public class GradeManager {

    public static Student[] createStudents() {

        Student S1 = new Student("omar", 201, new double[]{90, 95, 80});
        Student S2 = new Student("Roaa", 202, new double[]{98, 86, 83});
        Student S3 = new Student("Lara", 203, new double[]{75, 68, 81});
        Student[] students = {S1, S2, S3};
        return students;

    }

    public static void showAllStudents(Student[] students) {

        for (int i = 0; i < students.length; i++) {

            students[i].displayStudentInfo();

        }
    }

    public static Student findBestStudent(Student[] students) {

        Student best = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].getAverage() > best.getAverage()) {
                best = students[i];

            }
        }
        return best;
    }

    public static void main(String[] args) {

        Student[] students = createStudents();

        showAllStudents(students);

        Student best = findBestStudent(students);

        System.out.println("Best Student:");

        System.out.println("Name:" + best.getName());

        System.out.println("Average:" + best.getAverage());

    }

}
