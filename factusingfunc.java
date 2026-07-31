//basic factorial code uaing function
import java.util.*;
class Main {
   
    public static int factorial(int n)
    {
        int fact=1;
        while(n>0)
        {
        fact=fact*n;
        n--;
        }
         return fact;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner (System.in);
         
        int n=sc.nextInt();
        System.out.println(factorial(n));
    }
}
