package lesson07;

public class StringEx1 {

    public static void main(String[] args) {
        String str = "kasiuasdfhiuhuallh\nkfsadhlusadlhkusauhsadluasdiuas";
        System.out.println(str);
        int length = str.length();
        System.out.println(str.charAt(0));
        if (length % 2 == 1) {
            System.out.println(str.charAt(length/2));
        }
        System.out.println(str.charAt(length - 1));
        int l1 = str.indexOf("l");
        System.out.println(l1);
        System.out.println(str.indexOf("l", l1 + 1));
        System.out.println(str.indexOf("l", str.indexOf("l", l1 + 1) + 1));
        System.out.println(str.substring(15, 15 + "ll".length()));

    }
}
