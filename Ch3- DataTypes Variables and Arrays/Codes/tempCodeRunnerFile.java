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
        int[][] arr = new int[rows][co