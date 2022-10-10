package lesson10.animals;

public class Parrot extends Bird {

    public Parrot(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.println("nas i tyt neploho korm9t");
    }
}
