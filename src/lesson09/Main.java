package lesson09;

public class Main {

    public static void main(String[] args) {
        String s = "RegExr was created by gskinner.com, and is proudly hosted by Media Temple.\n" +
                "c t\n" +
                "c\tt\n" +
                "c-t\n" +
                "c0t\n" +
                "c.t\n" +
                "kot\n" +
                "kot\n" +
                "kot\n" +
                "kot\n" +
                "Edit the Expression & Text to see matches. Roll over matches or the expression for details. PCRE & JavaScript flavors of RegEx are supported. Validate your expression with Tests mode.\n" +
                "\n" +
                "The side bar includes a Cheatsheet, fu";

        s.indexOf("kot");

        String[] _kots = s.split("colou?r");
//        char[] chars = s.toCharArray();

        int length = _kots.length; // 9

        String array[] = new String[0];
        String pp = "c[%s]t";
        String out = "a-z";
        System.out.println(String.format(pp, out));

    }
}
