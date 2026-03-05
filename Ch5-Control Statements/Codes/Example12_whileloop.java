// Sum of Numbers from 1 to 10
public class Example12_whileloop {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while(i<=10){
            sum = sum + i;
            i++;
        }
        System.out.println("i is: "+ i);
        System.out.println("Sum: "+ sum);

    }
}
