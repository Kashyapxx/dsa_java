// Factorial of a number using for loop
public class Fact {
    public static void main(String[] args) {
        int n = 5;
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial is " + factorial);
    }
}
