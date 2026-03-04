public class Example2_nestedifs {
    public static void main(String[] args) {
        int marks = 85;
        if (marks >= 50) {
            if (marks >= 75) {
                System.out.println("Distinction");
            } else {
                System.out.println("Pass");
            }
        } else {
            System.out.println("Fail");
        }
    }
}
