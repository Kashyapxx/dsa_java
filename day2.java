//Basic if else if code for grade generation.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float marks = 0;  

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        marks = sc.nextFloat();

        if (marks >= 0 && marks < 25) {
            System.out.println("Grade: F");
        } else if (marks <= 44) {
            System.out.println("Grade: E");
        } else if (marks <= 49) {
            System.out.println("Grade: D");
        } else if (marks <= 59) {
            System.out.println("Grade: C");
        } else if (marks <= 69) {
            System.out.println("Grade: B");
        } else if (marks <= 100) {
            System.out.println("Grade: A");
        } else {
            System.out.println("Invalid marks entered.");
        }

        sc.close();
    }
}
