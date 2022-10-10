package lesson10.animals;

public class Lion extends WildAnimal {

    public Lion(String name, Integer age, Integer legs) {
        super(name, age, legs);
    }

    @Override
    public void eat() {
        System.out.println("eating zebra");
    }

    @Override
    public void voice() {
        System.out.println("roar");
    }
}
