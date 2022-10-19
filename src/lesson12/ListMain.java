package lesson12;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListMain {

    public static void main(String[] args) {
//        List<String> countries = new ArrayList<>();

        workWithCountries(new ArrayList<>());
        workWithCountries(new LinkedList<>());
//        workWithCountries(new Vector<>());
//        workWithCountries(new Stack<>());
//        workWithCountries(new ArrayDeque<>());
    }

    public static void workWithCountries(List<String> countries) {
        countries.size();
        countries.isEmpty();
        countries.add("Belarus");
        countries.contains("Senegal");
        countries.add("USA");
        countries.add("UK");
        countries.add("France");
        countries.remove(2);
        countries.add(2, "Spain");
        countries.add(0, "Italy");
        countries.add(5, "Costa Rica");
        countries.add(countries.size(), "Brazil");
        System.out.println(countries.get(4));

        System.out.println(countries);
    }
}
