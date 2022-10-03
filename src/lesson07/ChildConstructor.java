package lesson07;

public class ChildConstructor extends Constructor {

    // by default
    public ChildConstructor() {
        // by default
//        super();
        System.out.println("I'm child constructor");
    }

    public ChildConstructor(int b) {
        this( 5.0, b);
        System.out.println(" int");
    }

    public ChildConstructor(int b, double c) {
        super(b, 5);
    }

    public ChildConstructor(double c, int b) {
        super(b, 5);
        System.out.println(" b 5");
    }

    public ChildConstructor(double b) {
        super((int)b, 5);
    }

    public void methodChild() {

    }
}