public class Example5_switch {
    public static void main(String[] args) {
        int year = 2;
        String branch = "a";

        switch (year) {
            case 2:
                switch (branch) {
                    case "a":
                        System.out.println("Machine Learning");
                        break;
                    case "b":
                        System.out.println("Antenna Engineering");
                        break;
                }
        }
    }
}
