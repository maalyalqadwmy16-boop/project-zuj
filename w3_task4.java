package w3;

import java.util.Scanner;


public class w3_task4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter n1:");
        int n1=input.nextInt();
         System.out.println("Enter n2:");
        int n2=input.nextInt();
        
        System.out.println("1-add");
        System.out.println("2-sub");
        System.out.println("3-mul");
        System.out.println("4-div");
        System.out.println("5-quit");
int ch=input.nextInt();
        switch(ch){
            case 1 : System.out.println(n1+n2); break;
            case 2 : System.out.println(n1-n2);break;
            case 3 : System.out.println(n1*n2);break;
            case 4 : System.out.println(n1/n2);break;
            case 5 : System.out.println("good bye");break;
default:
    System.out.println("Error");
 
        
        }
    }
}