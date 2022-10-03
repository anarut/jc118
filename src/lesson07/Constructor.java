package lesson07;

// by default
public class Constructor {  // extends Object {

    // by default
    public Constructor(int a) {
        System.out.println("I'm parent constructor with 1 param");
    }

    // by default
    public Constructor(int a, int b) {
        //super();
        System.out.println("I'm parent constructor with 2 params");
    }

    public Constructor() {
        System.out.println("I'm parent constructor");
    }

    public void methodParent() {

    }
    public static void main(String[] args) {
        Constructor constructor = new Constructor(5);
        System.out.println(constructor);

        Constructor childConstructor = new ChildConstructor(6);
        System.out.println(childConstructor.getClass());
        childConstructor.methodParent();

        ChildConstructor cc = (ChildConstructor) childConstructor;
        cc.methodChild();

        Object a = cc;
        if (a instanceof String) {
            String a1 = (String) a;
            System.out.println(a1.length());
        }

        if (a instanceof String str) {
            System.out.println(str.length());
        }

    }
}
