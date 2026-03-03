public class Main23 {
    public static void main(String[] args) {
         double[][] matrix = {
            {2, -1, 0},
            {1, 2, -1},
            {3, 0, 1}
        };

        double det = determinant(matrix);

        if (det == 0) {
            System.out.println("Inverse does not exist (Determinant is 0)");
            return;
        }

        double[][] adj = adjoint(matrix);
        double[][] inverse = new double[3][3];

        // Inverse = adjoint / determinant
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverse[i][j] = adj[i][j] / det;
            }
        }

        System.out.println("Inverse of the matrix:");
        printMatrix(inverse);
    }

    // Function to calculate determinant of 3x3 matrix
    static double determinant(double[][] m) {
        return m[0][0] * (m[1][1]*m[2][2] - m[1][2]*m[2][1])
             - m[0][1] * (m[1][0]*m[2][2] - m[1][2]*m[2][0])
             + m[0][2] * (m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }

    // Function to calculate adjoint
    static double[][] adjoint(double[][] m) {
        double[][] adj = new double[3][3];

        adj[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]);
        adj[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]);
        adj[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]);

        adj[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]);
        adj[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]);
        adj[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]);

        adj[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]);
        adj[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]);
        adj[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]);

        return adj;
    }

    // Function to print matrix
    static void printMatrix(double[][] m) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%.3f ", m[i][j]);
            }
            System.out.println();
        }
    }
}
