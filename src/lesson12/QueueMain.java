package lesson12;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueMain {

    public static void main(String[] args) {
        Deque<String> cities = new ArrayDeque<>();
        cities.push("Minsk");
        cities.push("Brest");
        cities.push("London");
        cities.push("Madrid");
        System.out.println(cities);
        cities.pop();
        System.out.println(cities);
        cities.offer("Oslo");
        cities.offerFirst("Moscow");
        cities.offerLast("Sydney");
        System.out.println(cities);
        for (String city: cities) {
            System.out.println(city);
        }

        cities.forEach(city -> System.out.println(city));
    }
}
