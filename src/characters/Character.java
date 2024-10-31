package characters;

public abstract class Character {
    private String name;
    private int health;
    private int power;
    private String race;
    private int attackSpeed; // the lower, the better. max - 10
    private int recoverAbility; // 0 for no ability

    public Character(String name, int health, int power, String race, int attackSpeed, int recoverAbility) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.race = race;
        this.attackSpeed = attackSpeed;
        this.recoverAbility = recoverAbility;
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

    public int getAttackSpeed() {
     return attackSpeed;
    }

    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public int getRecoverAbility() {
        return recoverAbility;
    }

    public void setRecoverAbility(int recoverAbility) {
        this.recoverAbility = recoverAbility;
    }


    // тъй като за момента смятам, че методите attack и defend са еднакви за всяка раса,
    // единствените разлики са хардкоднатите параметри на бързина на атака, здраве и сила на удар,
    // затова не ги създавам като абстрактни методи

    public void attack(Character target) throws InterruptedException {
        while (getHealth() > 0 && target.getHealth() > 0) {
            int damage = getPower();
            target.defend(damage);
            Thread.sleep(getAttackSpeed() * 10L);
        }
    }

    public void defend(int attackPower) {
        health = getHealth();
        setHealth(health - attackPower);
        startRecover();
    }

    public void startRecover() {
        int health = getHealth();
        setHealth(health + 25);
    }
}
