package lesson04;

public class Ex4 {

    public static void main(String[] args) {
        int n = 648;

        for (int x = 1; x <= n; x++) {
            if (n % x == 0) {
                System.out.println(x);
            }
        }
    }
}
