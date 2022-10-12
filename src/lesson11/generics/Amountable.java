package lesson11.generics;

public interface Amountable<T extends Number> {

    T get();

    void add(T sum);

    void subtract(T sum);
}
