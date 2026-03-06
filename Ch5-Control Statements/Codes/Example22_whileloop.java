import java.util.Scanner;

public class Example22_whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        //logic
        int first = 0, second = 1;
        int count = 0;
        while (count < n) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
            count++;
        }
    }
}
