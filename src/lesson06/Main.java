package lesson06;

public class Main {

    public static void main(String[] args) {
        Phone phone1 = new Phone("LG", "G4S", "Black");
        Phone phone2 = new Phone("Samsung", "Galaxy S21", "White");
        Phone phone3 = new Phone("Apple", "14 Pro Max", "Red", 12, 6, 300);
        Phone phone4 = new Phone("Apple", "13 Pro", "Red", 11, 5, 250);
        Phone phone5 = new Phone("Apple", "13 Pro", "Black", 11, 5, 250, true, false, 2021);

        Phone[] phoneList = {phone1, phone2, phone3, phone4, phone5};

        phone3.call("Anatolii");
        phone2.call(124235436346L);
        phone5.openPage("google.com");

        System.out.println();
    }
}
