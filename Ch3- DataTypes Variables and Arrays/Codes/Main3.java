public class Main3 {
    public static void main(String[] args) {
        int outerVar = 10; // outer scope

        if (outerVar > 5) {  // inner scope
            System.out.println(outerVar); // ✅ Accessible
        }
    }
}
