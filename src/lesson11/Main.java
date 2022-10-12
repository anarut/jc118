package lesson11;

public class Main {

    static final String HELP = "help";
    static final String VERSION = "version";

    public static void main(String[] args) {
        System.out.println("Hello lesson 11 program");


        String command = args.length > 0 ? args[0] : "";///????
        switch (command) {
            case HELP -> System.out.println("options: help, version");
            case VERSION -> System.out.println("v1.0");
            default -> System.out.println("unknown command. Try using help");
        }

        System.out.println("closed!");
    }
}
