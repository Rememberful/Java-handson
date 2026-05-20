public class Example45_dowhile {
    public static void main(String[] args) {
        int row = 1;
        do {
            int col = 1;
            do {
                System.out.print("* ");
                col++;
            } while (col<=3);
            
            System.out.println();
            row++;
        } while (row<=3);
    }
}


