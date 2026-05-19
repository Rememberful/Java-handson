import java.util.*;

public class Example42_dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===Menu===");
            System.out.println("1. For Hey");
            System.out.println("2. For Hello");
            System.out.println("3. For exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Hey");
                    break;

                case 2:
                    System.out.println("Hello");
                    break;
                
                case 3:
                    System.out.println("Exiting the program");
                    break;

                default:
                    System.out.println("Invalid entry");
                    break;
            }
        } while (choice!=3);
    }
}
