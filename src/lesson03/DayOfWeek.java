package lesson03;

public class DayOfWeek {

    public static void main(String[] args) {
        int num = -1153;

        num = num % 7;

        if (num == 0) {
            System.out.println("sreda");
        } else if (num == 1) {
            System.out.println("4etverg");
        } else if (num == 2) {
            System.out.println("friday");
        } else if (num == 3) {
            System.out.println("subbota");
        } else if (num == 4) {
            System.out.println("sunday");
        } else if (num == 5) {
            System.out.println("monday");
        } else if (num == 6) {
            System.out.println("vtornik");
        }

        System.out.println("----");

        switch (num) {
            case 0:
                System.out.println("sreda");
                break;
            case 1:
            case -6:
                System.out.println("4etverg");
                break;
            case 2:
            case -5:
                System.out.println("friday");
                break;
            case 3:
            case -4:
                System.out.println("subbota");
                break;
            case 4:
            case -3:
                System.out.println("sunday");
                break;
            case 5:
            case -2:
                System.out.println("monday");
                break;
            case 6:
            case -1:
                System.out.println("vtornik");
                break;
        }
    }
}
