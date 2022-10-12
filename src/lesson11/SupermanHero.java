package lesson11;

public class SupermanHero extends AbstractHero {

    @Override
    public void useSkill1(Point point) {
        //lazer
    }

    @Override
    public void useSkill2() {
        // ultravision
    }

    @Override
    public void useSkill3() {
        // explosion
    }

    @Override
    public void attack(Hero hero) {
        int speed = getSpeed();
        //punch
    }
}
