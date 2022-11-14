package lesson18;

public class Main {

    public static void main(String[] args) {
        Applicable sum1 = new Applicable() {
            @Override
            public int apply(int a, int b) {
                return a + b;
            }
        };

        Applicable sum2_1 = (x, y) -> {
//            System.out.println();
            return x + y;
        };

        Applicable sum2_2 = (x, y) -> x + y;

        Applicable sum3 = Integer::sum;
        Applicable sum4 = sum1::apply;

        Applicable max = Integer::max;
//        Applicable a = Integer::rotateRight;
        System.out.println(sum3.apply(5, 8));
    }
}

@FunctionalInterface
interface Applicable {

    int apply(int a, int b);

}