package lesson04;

public class Ex5 {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 0; i < 15 - 2; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
//            System.out.println("a=" + a + " b=" + b);
        }

    }
}
