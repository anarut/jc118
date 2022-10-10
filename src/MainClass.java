import java.util.Random;

public class MainClass {

    static final int NUMBER_555 = 555;

    int d;

    public static void main(String[] args) {
        System.out.println("hello students!");
        System.out.println("Hello world!");
        byte b1 = 117;
        byte b2 = (byte)(b1 + 10);

        int f = 0;

        byte i1 = (byte)(55 + 1);







        int a = -129;
        byte b = (byte) a;
        System.out.println(b);

        a = 5;
        a = a * new Random().nextInt(10);

        final int c = a;


        long season;

        ///code
        season = 2022_2023;

        int d = 1_0001;

        int i = 555;

//        byte a = 200;

        long l = 4_234_567_890L;

        char someChar1 = 116; //074 = 7 * 16 + 4
        char someChar2 = '6' + '7';
        System.out.println(someChar1);
        System.out.println(someChar2);

        char unicodeChar = 'v';
        System.out.println(unicodeChar);


        Integer as1 = 55;
        Integer as2 = Integer.valueOf(55);
        int as3 = as2;

        Integer fail = null;
        if (fail != null) {
            go(fail);
        } else {
            System.out.println("oioioi");
        }

    }

    static void go(int a) {

    }
}
