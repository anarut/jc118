package lesson10.animals;

public class Tiger extends WildAnimal {

    public Tiger(String name, Integer age, Integer legs) {
        super(name, age, legs);
    }

    @Override
    public void eat() {
        System.out.println("eating hienas");
    }

    @Override
    public void voice() {
        System.out.println("myr");
    }
}
