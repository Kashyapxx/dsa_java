//Given two integers low and high, return the sum of all integers from low to high inclusive.
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
  {

        Scanner sc = new Scanner(System.in);
          // Taking input from user
        System.out.print("Enter the starting number: ");
        int low = sc.nextInt();

        System.out.print("Enter the ending number: ");
        int high = sc.nextInt();

        int sum = 0;

        // for loop to calculate sum
        for (int i = low; i <= high; i++) 
        {
            sum = sum + i;     
        }
        System.out.println("Sum is " + sum);
    }
}
