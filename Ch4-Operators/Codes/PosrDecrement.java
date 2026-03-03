public class PosrDecrement {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Value of a original: " + a);
        int b = a--;
        System.out.println("Value of b: " + b); // b = a, as we didn't called b
        System.out.println("Value of a now is: " + a);
    }
}
