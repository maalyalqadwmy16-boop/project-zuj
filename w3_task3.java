
package w3;

import java.util.Scanner;

public class w3_task3 {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number :");
        int x=s.nextInt();
        
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
                
                
            }
            System.out.println("*");
        }
        
    }
}
