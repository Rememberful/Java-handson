public class PostIncrement {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("value of a at start: " + a);
        int b = a++;
        System.out.println("Value of a after doing a++: "+ b);   
        System.out.println("The moment we used a, as it is storing the value now of a++: "+ a);   
    }
}
