package lesson10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex {

    public static void main(String[] args) {
        String find = "to";
        String str = "adsfma;  to today to   tattoo";

        boolean matches = str.matches(find + "[^\\w]");
        Pattern compile = Pattern.compile("(\\b" + find + "\\b)");
        Matcher matcher = compile.matcher(str);
        boolean b = matcher.find();
        System.out.println(matches);
    }
}
