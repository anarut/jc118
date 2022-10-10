package lesson10.animals;

public class Bird extends FlyingAnimal {

    public Bird(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("eating worms");
    }

    @Override
    public void voice() {
        System.out.println("4irik");
    }
}
