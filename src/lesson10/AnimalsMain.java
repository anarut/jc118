package lesson10;

import lesson10.animals.Bird;
import lesson10.animals.Cat;
import lesson10.animals.Dog;
import lesson10.animals.Fly;
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
    }
}
