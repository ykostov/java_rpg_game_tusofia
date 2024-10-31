import characters.Amazon;
import characters.Character;
import characters.Paladin;
import monsters.Monster;
import monsters.Undead;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("game brum brum brum");

        Paladin human = new Paladin("Bate Vanko");
        Undead undead = new Undead("Fallen Shaman");
        startBattleBetweenChMon(human, undead);
    }


    protected static void startBattleBetweenChMon(Character ch1, Monster m1) throws InterruptedException {
        while (ch1.getHealth() > 0 && m1.getHealth() > 0) {
            ch1.attackMonster(m1);
            m1.attack(ch1);
        }


    }
}