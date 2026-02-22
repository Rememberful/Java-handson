public class Main3 {
    public static void main(String[] args) {
        int outerVar = 10; // outer scope

        if (outerVar > 5) {  // inner scope
            // int outerVar=1; // can't do 
            System.out.println(outerVar); // Accessible
        }
    }
}
