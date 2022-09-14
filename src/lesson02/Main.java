package lesson02;

public class Main {

    public static void main(String[] args) {
        int a = 5;

        int b = 4;
        System.out.println(a++); // 6      5
        System.out.println((++a)); // 4 6    7

        System.out.println(a);
        a = a + 1;

        a = a + 1;
        System.out.println(a);

        a = a + 5;
        a += 5;
        a = a * b;
        a *= b;

        a++; //a = a + 1;
        ++a;


        int x = 2;
        int i = 132 << 2 + x++ | 4;
    }
}
