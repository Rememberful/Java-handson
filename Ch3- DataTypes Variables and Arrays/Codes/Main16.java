//Matrix Subtraction
public class Main16 {
    public static void main(String[] args) {
        int[][] a = {{1,1,1},{1,1,1},{1,1,1}};
        int[][] b = {{1,1,1},{1,1,1},{1,1,1}};
        // New matrix
        int[][] c = new int[a.length][a[0].length];
        // Subtracting
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                c[i][j] = a[i][j]-b[i][j];
            }
        }
        //printing the difference
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
