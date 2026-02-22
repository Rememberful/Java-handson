public class Main4 {
    public static void main(String[] args) {
        if (true) {  // inner scope
            int innerVar = 20;
            System.out.println(innerVar); // ✅ Accessible here
        }
        // System.out.println(innerVar); // ❌ ERROR! Not accessible
    }
}
