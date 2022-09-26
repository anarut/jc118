package lesson06;

public class Phone {

    AddressBook addressBook;
    String manufacturer;
    String model;
    String color;
    double length;
    double width;
    double weight;
    boolean hasCamera;
    boolean hasSecondSlot;
    int releaseYear;
    boolean isInternetEnabled;

    public Phone(String manufacturer, String model, String color) {
        this(manufacturer, model, color, 0, 0, 0);
    }

    public Phone(String manufacturer, String model, String color, double length, double width, double weight) {
        this(manufacturer, model, color, length, width, weight, false, false, 0);
    }

    public Phone(String manufacturer, String model, String color, double length, double width, double weight, boolean hasCamera, boolean hasSecondSlot, int releaseYear) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
        this.length = length;
        this.width = width;
        this.weight = weight;
        this.hasCamera = hasCamera;
        this.hasSecondSlot = hasSecondSlot;
        if (releaseYear < 0) {
            System.out.println("error");
        }
        this.releaseYear = releaseYear;
    }

    public void call(long number) {
        // init
        System.out.println("Calling to " + number);
    }

    public void call(String contactName) {
        // init
        // search in contacts number;
        Contact[] contacts = addressBook.contacts;
        for (Contact contact : contacts) {
            if (contactName.equals(contact.name)) {
                System.out.println("Calling to " + contact.number);
                break;
            }
        }
    }

    public void openPage(String url) {
        if (isInternetEnabled) {
            //open url in browser
        } else {
            //open not internet page;
        }
    }
}
