package lesson11.generics;

import lesson11.ClassC;
import lesson11.Hero;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        Person alex = new Person("Alex", "Ivanov");
        Person petr = new Person("Petr", "Sidorov");

        Account account1 = new Account(234512, alex);
        Account account2 = new Account(1234435, petr, "EUR", 10);
        Account account3 = new Account(1234435, petr);
        DecimalAccount decimalAccount = new DecimalAccount(1235, alex);
        DecimalAccount decimalAccount1 = new DecimalAccount(6242,  petr, "BYN", new BigDecimal("1312321312312312.22"));
        System.out.println(decimalAccount1);

        GenericAccount<Integer, Integer> usd =
                new GenericAccount<>(436462346, alex, "USD", 10);
        Integer id = usd.getId(); //Object
        GenericAccount<String, Integer> eur =
                new GenericAccount<>("123jqda1324", petr, "EUR", 100);
        String id1 = eur.getId();

        GenericAccount<String, Double> uan =
                new GenericAccount<>("dakj211", alex, "UAN", 123.42d);
        GenericAccount<String, BigInteger> uan2 =
                new GenericAccount<>("dakj211", alex, "UAN", new BigInteger("317868732648923164"));
    }
}
