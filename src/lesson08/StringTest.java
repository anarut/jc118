package lesson08;

public class StringTest {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int n = 10; //250000;
        String s = "";
        for (int i = 0; i < n; i++) {
            s += i;
        }
//        System.out.println(s);
        long end = System.currentTimeMillis();
        System.out.println(end - start + " millis");

        start = System.currentTimeMillis();
        StringBuilder s1 = new StringBuilder(1088890);//1088890
        for (int i = 0; i < n; i++) {
            s1.append(i);
        }
//        System.out.println(s1.toString());
        end = System.currentTimeMillis();
        System.out.println(end - start + " millis");
        System.out.println(s1.length());
    }
}
