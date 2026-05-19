// Number guessing game
import java.util.Scanner;
public class Example43_dowhile {
    public static void main(String[] args) {

        int secret = 7;
        Scanner sc = new Scanner(System.in);
        int guess;
        do {
            System.out.println("Enter the value:");
            guess = sc.nextInt();

            if(guess==secret){
                System.out.println("Correct guess");
            }
            else if(guess<secret){
                System.out.println("Too low!");
            }
            else{
                System.err.println("Too high!");
            }
        } while (guess!=secret);
    }   
}
