package lesson10;

import lesson10.animals.Animal;
import lesson10.animals.Bird;
import lesson10.animals.Cat;
import lesson10.animals.Chiken;
import lesson10.animals.Dog;
import lesson10.animals.Earthable;
import lesson10.animals.Fly;
import lesson10.animals.FlyingAnimal;
import lesson10.animals.Human;
import lesson10.animals.Lion;
import lesson10.animals.Parrot;
import lesson10.animals.Tiger;

public class AnimalsMain {

    public static void main(String[] args) {
        Human human1 = new Human("Alex", 33, 2);
        Human human2 = new Human("John", 42, 1, true);
        Human human3 = new Human("Kirill", 14, 3, true);
        Cat tom = new Cat("Tom", 4, 4);
        Dog hatiko = new Dog("Hatiko", 8, 4);
        Lion lion = new Lion("Symba", 3, 4);
        Tiger sherhan = new Tiger("Sherhan", 11, 4);
        Bird bird = new Bird("Eagle", 5);
        Parrot gosha = new Parrot("Gosha", 3);
        Fly vzhik = new Fly("Vzhik", 1);

        Animal animal = vzhik;
        if (animal instanceof FlyingAnimal flyingAnimal) {
            flyingAnimal.fly();
        }

        Animal[] animals = {human1, human2, human3, tom, hatiko, lion, sherhan, bird, gosha, vzhik};

        for (Animal a : animals) {
            a.voice();
        }

        System.out.println();
        for (Animal a : animals) {
            a.eat();
        }

        System.out.println();
        for (int i = 0; i < animals.length; i++) {
            animals[i].sleep();
        }

        Chiken chiken = new Chiken("chick", 1);

        Earthable[] anim = { human1, hatiko, chiken };
        anim[0].run();
        anim[0].sleep();

        Object o = chiken;
        if (o instanceof Earthable eathable) {

        }
    }

    public static void processAnimals(Animal[] animals) {

        if (animals[0] instanceof Earthable eathable) {

        }
    }
}
