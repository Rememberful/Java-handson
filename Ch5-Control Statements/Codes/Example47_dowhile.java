public class Example47_dowhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            // i++;
            if(i==5){
                continue;
            }
            System.out.println(i);
            i++;
        } while (i<=10);
    }
}
