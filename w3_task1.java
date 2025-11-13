package w3;

import java.util.Scanner;

public class w3_task1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number :");
        int n = s.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter number " + i + ":");
            int x = s.nextInt();

            if (x % 2 == 1) {
                sum += x;
            }

        }

        System.out.println("sum : " + sum);

    }
}
