package lesson10.animals;

public class Human extends EarthAnimal {

    boolean isDriver;

    public Human(String name, Integer age, Integer legs) {
        super(name, age, legs);
    }

    public Human(String name, Integer age, Integer legs, boolean isDriver) {
        super(name, age, legs);
        this.isDriver = isDriver;
    }

    @Override
    public void eat() {
        System.out.println("eating draniki");
    }

    @Override
    public void voice() {
        System.out.println("hello world");
    }
}
