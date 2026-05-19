import java.util.*;
public class Example44_dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter a +ve number:");
            num = sc.nextInt();

            if(num<=0){
                System.out.println("Invalid Input");
            }
        } while (num<=0);
        System.out.println("Valid Number Entered: " + num);
    }
}
