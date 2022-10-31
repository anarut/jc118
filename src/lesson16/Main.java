package lesson16;

import java.math.BigDecimal;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws MyException {
        int i = new Random().nextInt(101) - 50;
        double v = Math.random() * 101 - 50;
        BigDecimal bigDecimal = new BigDecimal(i);


        try {
            test();
        } catch (MyException e) {
            e.printStackTrace();
            String date = e.getDate();
//            throw e;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void test() throws MyException {
        throw new MyException("31 Oct", true);
    }
}
