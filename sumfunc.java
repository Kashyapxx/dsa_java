//basic code for sum of 2 integers using a function
import java.util.*;
class Main {
    public static int calcsum(int a, int b)
    {
        int sum= a+b;
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner (System.in);
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        
       int sum= calcsum(a,b);
        
        System.out.println(" The sum is :"+sum);
    }
}
