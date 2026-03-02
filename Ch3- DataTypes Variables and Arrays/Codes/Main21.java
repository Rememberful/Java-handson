//Trace of a Matrix
public class Main21 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int trace=0;
        for (int i = 0; i < matrix.length; i++) {
            trace += matrix[i][j];
        }
        System.out.println("Trace is: " + trace);
    }
}
