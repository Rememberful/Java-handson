public class Example8_switch {
    public static void main(String[] args) {
        int a = 10;
        switch (a) {
            case 9:
                System.out.println("Yes");
                break;
            case 11,10:
                System.out.println("Hey");
                // break;
            default:
                System.out.println("HEYEYEY");
        }
    }
}
