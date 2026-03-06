import java.util.Scanner;

public class Example17_whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        //logic
        int factorial = 1;
        int i = 1;
        while (i <= num) {
            factorial = factorial * i;
            i++;
        }
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
