package lesson10.animals;

public class Chiken extends FlyingAnimal implements Earthable {

    public Chiken(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void eat() {

    }

    @Override
    public void voice() {

    }

    @Override
    public void run() {
        System.out.println("run");
    }
}
