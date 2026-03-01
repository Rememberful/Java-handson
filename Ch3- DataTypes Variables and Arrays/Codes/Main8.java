import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking user input for rows and columns
        System.err.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.err.println("Enter the number of columns:");
        int cols = sc.nextInt();

        //Creating the array
        int[][] arr = new int[rows][cols];

        //Looping to take the user input
        System.err.println("Enter the elements now... ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Printing the array
        System.out.println("Printing the entered element...");
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
