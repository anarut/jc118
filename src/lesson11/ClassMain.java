package lesson11;

public class ClassMain {

    public static void main(String[] args) {
        var staticInnerClass1 = new lesson11.ClassStructure.StaticInnerClass();
        var staticInnerClass2 = new lesson11.ClassStructure.StaticInnerClass();
        ClassStructure.StaticInnerClass staticInnerClass3 = new ClassStructure.StaticInnerClass();

        ClassStructure classStructure = new ClassStructure();
        ClassStructure.InnerClass innerClass1 = classStructure.new InnerClass();
        classStructure.setA(5);
        ClassStructure.InnerClass innerClass2 = classStructure.new InnerClass();
        classStructure.setA(10);
        ClassStructure.InnerClass innerClass3 = classStructure.new InnerClass();

        ClassStructure classStructure2 = new ClassStructure();
        ClassStructure.InnerClass innerClass = classStructure2.new InnerClass();

        class A {
            int x;
            int y;

            @Override
            public String toString() {
                return "A{" +
                        "x=" + x +
                        ", y=" + y +
                        '}';
            }
        }


        A a = new A();
        a.x = 6;
        a.y = 3;
        System.out.println(a);

        A a1 = new A();
        System.out.println(a.getClass());

    }
}
