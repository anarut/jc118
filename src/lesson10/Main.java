package lesson10;

import lesson10.animals.Animal;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("123123");

        BigInteger bigInteger = new BigInteger("812357896581358917358923785613478561783567812365817658723658762315876231");
        System.out.println(bigInteger);

        Person person = new Person("Alex", 16, true);

//        person.name = "Alex";
//        person.age = 15;
//        person.setName("Alex");

        int age = person.getAge();
        age = age + 5;

        //

//        person.age = -200;

        //
        processPerson(person);


//        Animal animal = new Animal();
    }


    public static void processPerson(Person person) {
        if (person.getAge() < 18) {
            System.out.println("no access");
        }
    }
}
