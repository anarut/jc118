package lesson18;

public class Main {

    public static void main(String[] args) {
        int j = 5;
        j +=4;
        int l = j;
        Applicable sum1 = new Applicable() {
            @Override
                public int apply(int a, int b) {
                return a + b + l;
            }
        };

        Applicable sum2_1 = (x, y) -> {
//            System.out.println();
            return x + y;
        };

        Applicable sum2_2 = (x, y) -> x + y;
        Applicable max_1 = (x, y) -> Math.max(x, y) + l;
        Applicable min_1 = (x, y) -> Math.min(x, y);


        int a1 = max_1.apply(4,5);
        //l = 6;
        int a2 = max_1.apply(4,5);
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