package lesson10.animals;

public abstract class EarthAnimal extends Animal implements Earthable {

    private Integer legs;


    public EarthAnimal(String name, Integer age, Integer legs) {
        super(name, age);
        this.legs = legs;
    }

    public void run() {
        System.out.println("running");
    }

    public Integer getLegs() {
        return legs;
    }
}
