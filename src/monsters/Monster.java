package monsters;

import characters.Character;

public abstract class Monster {
    private String name;
    private int health;
    private int power;
    private String race;

    public Monster(String name, int health, int power, String race) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void attack(Character target) throws InterruptedException {
        while (getHealth() > 0 && target.getHealth() > 0) {
            int damage = getPower();
            target.defend(damage);
        }
    }
}
