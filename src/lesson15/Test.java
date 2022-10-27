package lesson15;

public class Test<T extends CharSequence,K> implements Comparable<T> {

    @Override
    public int compareTo(T o) {
        return this.toString().compareTo(o.toString());
    }
}
