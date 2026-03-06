import java.util.Scanner;

public class Example27_whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            int fact = 1;
            int i = 1;
            while (i <= digit) {   // find factorial of digit
                fact = fact * i;
                i++;
            }
            sum = sum + fact;
            num = num / 10;
        }
        if (sum == original) {
            System.out.println("The number is a Strong Number.");
        } else {
            System.out.println("The number is not a Strong Number.");
        }
    }
}
