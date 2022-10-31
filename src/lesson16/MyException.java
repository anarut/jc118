package lesson16;

public class MyException extends Throwable {

    private String date;
    private boolean isAdmin;

    public MyException(String date, boolean isAdmin) {
        this.date = date;
        this.isAdmin = isAdmin;
    }

    public String getDate() {
        return date;
    }

    public boolean isAdmin() {
        return isAdmin;
    }
}
