import java.util.Scanner;

public class Example25_whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int product = 1;
        while (num != 0) {
            int digit = num % 10;   // get last digit
            product = product * digit;  // multiply digit
            num = num / 10;        // remove last digit
        }
        System.out.println("Product of digits: " + product);
    }
}
