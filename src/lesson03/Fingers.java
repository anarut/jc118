package lesson03;

public class Fingers {

    public static void main(String[] args) {
        int n = 4;

        switch (n) {
            case 1:
                System.out.println("Bolshoy palec");
                break;
            case 2:
                System.out.println("Ukazatelni palec");
                break;
            case 3:
                System.out.println("Sredniy palec");
                break;
            case 4:
                System.out.println("No name");
                break;
            case 5:
                System.out.println("Mezinec");
            default:
                System.out.println("ti ne 4elovek");
        }


    }
}
