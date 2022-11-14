package lesson17;

import java.io.Console;
import java.io.IOException;

public class ConsoleMain {

    public static void main(String[] args) {

        // получение консоли
        Console console = System.console();
        if(console!=null){
            // считывание данных с консоли
            String login = console.readLine("Login:");
            char[] password = console.readPassword("Password:");

            console.printf("Your login: %s \n", login);
            console.printf("Your password: %s \n", new String(password));
        }

    }

}
