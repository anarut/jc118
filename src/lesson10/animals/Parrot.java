package lesson10.animals;

public final class Parrot extends Bird {

    public Parrot(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("nas i tyt neploho korm9t");
    }

    @Override
    public void sleep() {
        System.out.println("ne ho4y");
    }
}
