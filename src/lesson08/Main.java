package lesson08;

public class Main {

    public static void main(String[] args) {
        char aUpper = 'A';
        char zUpper = 'Z';
        System.out.println((int) aUpper);
        System.out.println((int) zUpper);
        char aLower = 'a';
        char zLower = 'z';
        System.out.println((int) aLower);
        System.out.println((int) zLower);
        char x = 'f';
        if (x >= 'a' && x <= 'z') {
            System.out.println("lower");
        }

        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder = stringBuilder.append("1234567890123456"); // не обязательно сохранять

        stringBuilder.append("Hello")
                .append("tttt")
                .delete(2, 4)
                .reverse()
                .append(124)
                .replace(3, 6, "test");
        stringBuilder.reverse();
    }
}
