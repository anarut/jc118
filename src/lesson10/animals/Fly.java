package lesson10.animals;

public class Fly extends FlyingAnimal {

    public Fly(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("eating honey");
    }

    @Override
    public void voice() {
        System.out.println("bzzz");
    }
}
