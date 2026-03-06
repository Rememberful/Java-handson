import java.util.Scanner;

public class Example26_whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = sc.nextInt();

        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();

        int result = 1;
        int i = 1;
        while (i <= exponent) {
            result = result * base;
            i++;
        }
        System.out.println("Result: " + result);
    }
}
