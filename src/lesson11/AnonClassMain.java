package lesson11;

import lesson10.animals.Earthable;

public class AnonClassMain {

    public static void main(String[] args) {
        Earthable earthable = new Earthable() {
            @Override
            public void run() {
                System.out.println("run");
            }
            @Override
            public void sleep() {
                System.out.println("no sleep");
            }
        };

        System.out.println(earthable.toString());


        Point point1 = new Point();
        System.out.println(point1);
        Point point = new Point() {

            @Override
            public int getX() {
                return super.getX() + 1;
            }

            @Override
            public int getY() {
                return super.getY() - 1;
            }

            public void todo() {

            }
        };
        System.out.println(point);
//        point.todo();
    }
}
