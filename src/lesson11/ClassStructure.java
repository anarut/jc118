package lesson11;

public class ClassStructure {

    private static int stat;
    private int a;


    public class InnerClass {
        private int b;
        public InnerClass() {
            b = a;
        }
    }

    public static class StaticInnerClass {
        private int b;
        public StaticInnerClass() {
            b = stat;
//            b = a;
        }
    }

    public static void main(String[] args) {
        var staticInnerClass = new StaticInnerClass();
    }

    public void setA(int a) {
        this.a = a;
    }
}

