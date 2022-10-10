package lesson10.animals;

public abstract class Animal {

    private String name;
    private Integer age;

    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat();

    public abstract void voice();

    public void sleep() {
        System.out.println("Zzzzzz");
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
