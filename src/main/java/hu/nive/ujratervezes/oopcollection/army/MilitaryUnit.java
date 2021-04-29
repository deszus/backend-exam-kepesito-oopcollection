package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {
    private int life;
    private final int power;
    private final boolean armor;

    public MilitaryUnit(int life, int power, boolean armor) {
        this.life = life;
        this.power = power;
        this.armor = armor;
    }

    public int doDamage() {
        return this.power;
    }

    public void sufferDamage(int damage) {
        this.life -= (this.armor) ? damage / 2 : damage;
    }

    public int getHitPoints() {
        return this.life;
    }
}