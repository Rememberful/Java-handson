//Smallest element of 2D array
public class Main11 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{44,3,2}};
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        }
        System.out.println("Smallest element is: "+ min);
    }
}
