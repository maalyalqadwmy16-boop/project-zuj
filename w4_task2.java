
package w4;
import java.util.Scanner;
public class w4_task2 {
    public static void main(String[] args) {
        
        int n1=readNumber();
        int n2=readNumber();
        int s=add(n1,n2);
        System.out.println(s);
           }
    
    public static int add(int n1,int n2){
    int sum=n1+n2;
    return sum;
    
    }
    
    public static int readNumber(){
             Scanner s=new Scanner (System.in);
        System.out.println("Enter  number:");
        int n=s.nextInt();
        return n;
            }  
}
