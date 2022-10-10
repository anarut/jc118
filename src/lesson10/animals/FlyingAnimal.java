package lesson10.animals;

public abstract class FlyingAnimal extends Animal {

    public FlyingAnimal(String name, Integer age) {
        super(name, age);
    }

    public void fly() {
        System.out.println("flying");
    }
}
