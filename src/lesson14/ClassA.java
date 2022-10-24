package lesson14;

import java.util.Objects;

public class ClassA {

    public int a = 1;


    public ClassA(int a) {
        this.a = a;
    }

    public int getB() {
        return a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClassA)) return false;
        ClassA classA = (ClassA) o;
        return a == classA.a;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}
