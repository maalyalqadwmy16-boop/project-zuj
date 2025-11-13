package w4;
import java.util.Scanner;

public class w4_task1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of grades :");
        int n = s.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter value :");
            a[i] = s.nextInt();
        }
        int sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += a[j];
        }
        double avg = sum / a.length;

      System.out.println("sum :" + sum +" "+ "avg :" + avg);
    }
}
