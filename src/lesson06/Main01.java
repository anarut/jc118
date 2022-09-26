package lesson06;

public class Main01 {

    public static int a = 1;
    protected static int d = 4;
    static int c = 3;
    private static int b = 2;

    public static void main(String[] args) {
        int b = a;
        int a = Main01.a;
        int c = a;
        int d = Main01.b;
        int e = Main01.c;
        int f = Main01.d;
    }
}
