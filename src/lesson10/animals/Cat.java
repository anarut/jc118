package lesson10.animals;

public class Cat extends PetAnimal {

    public Cat(String name, Integer age, Integer legs) {
        super(name, age, legs);
    }

    @Override
    public void eat() {
        System.out.println("eating mice");
    }

    @Override
    public void voice() {
        System.out.println("meow meow");
    }
}
