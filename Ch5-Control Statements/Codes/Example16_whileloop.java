public class Example16_whileloop {
    public static void main(String[] args) {
        int num = 1000;
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        System.out.println("Digits = " + count);
    }
}
