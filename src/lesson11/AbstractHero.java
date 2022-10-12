package lesson11;

public abstract class AbstractHero implements Hero {

    private String skin;
    private int health;
    private int power;
    private int speed;

    @Override
    public void move(Point point) {
        System.out.println(speed + "* " + point);
    }

    public int getSpeed() {
        return speed;
    }
}
