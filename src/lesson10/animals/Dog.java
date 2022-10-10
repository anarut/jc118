package lesson10.animals;

public class Dog extends PetAnimal {

    public Dog(String name, Integer age, Integer legs) {
        super(name, age, legs);
    }

    @Override
    public void eat() {
        System.out.println("eating bones");
    }

    @Override
    public void voice() {
        System.out.println("wow wow");
    }
}
