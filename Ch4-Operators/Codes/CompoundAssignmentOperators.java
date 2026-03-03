public class CompoundAssignmentOperators {
    public static void main(String[] args) {
        int a = 10;
        a = a+2; //valid
        System.out.println(a);
        a += 1; // same as a = a + 1;
        System.out.println(a);
        int b = 10;
        b *= 10;
        System.out.println(b);
    }
}
