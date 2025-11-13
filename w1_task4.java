
package w2;

import java.util.Scanner;


public class w1_task4 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n1:");
        int n1=s.nextInt();
        System.out.print("Enter n2:");
        int n2=s.nextInt();

        if (n1>n2) {
            System.out.println(n1*2);
        }
        else if (n2>n1) {
            System.out.println(n2*2);
        }
        else
            System.out.println(n1+n2);
        
        
        
    }
}
