// Average of the elements of the array
public class Main7 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int result = 0;
        for(int i = 0; i<arr.length;i++){
            result += arr[i];
        }
        System.out.println("Average is: " + result/arr.length);
    }
}
