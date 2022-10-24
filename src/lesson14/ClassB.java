package lesson14;

public class ClassB extends ClassA {

    public int b;

    public ClassB(int b) {
        super(b);
        this.b = b;
    }

    @Override
    public int getB() {
        return b;
    }


    public static void main(String[] args) {
        ClassA a123 = new ClassB(11);
        System.out.println(a123.getB());
        System.out.println(a123.a);
        ClassB classB1 = (ClassB) a123;
        System.out.println(classB1.b);
    }



}
