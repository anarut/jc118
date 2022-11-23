package lesson21;

public class Main {

    public static void main(String[] args) {
        Class<Main> mainClass = Main.class;
        Class<Main> mainClass1 = Main.class;
        System.out.println(mainClass.hashCode());
        System.out.println(mainClass1.hashCode());
    }
}
