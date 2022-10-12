package lesson11;

public class ClassC {

    private ClassA classA;
    private ClassB classB;

    public ClassC(ClassA classA, ClassB classB) {
        this.classA = classA;
        this.classB = classB;
    }

    public void doA() {
        classA.doA();
        /*
        aaaa
        */
    }

    public Integer doB(String s) {
        return classB.doB(s);
    }

    public void doA2() {
        classB.doA();
        /*
        aaaa
        */
    }
}
