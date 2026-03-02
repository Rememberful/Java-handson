public class Main19 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };

        int n = matrix.length;
        boolean isSymmetric = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[i][j] != matrix[j][i]){
                    isSymmetric=false;
                    break;
                }
            }
        }

        if(isSymmetric){
            System.out.println("Yes, Symmetric!");
        }
        else{
            System.out.println("Not Symmetric");
        }
    }
}
