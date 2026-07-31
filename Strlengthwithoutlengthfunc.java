// THIS IS A BASIC CODE FOR FINDING THE LENGTH OF A STRING WITHOUT USING THE LENGTH FUNCTION , SO WE DO IT LOGICALLY BY CONVERTING STRING TO ARRAY AND THEN USING FOR LOOP.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            count++;
        }

        System.out.println("Length of string: " + count);
    }
}
