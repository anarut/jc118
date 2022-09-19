package lesson04;

public class Ex3 {

    public static void main(String[] args) {
        int n = 11;
        int m = 4;
        for (int j = 0; j < 4; j++) {
            for (int i = 1; i <= 11; i++)
                System.out.print("* ");
            System.out.println();
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }

    }
}
