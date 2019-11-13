import behaviours.KnifeBehaviour;
import characters.King;
import characters.Character;
import characters.Troll;

public class Runner {

    public static void main(String[] args) {
        Character king = new King();
        king.fight();
        king.setWeapon(new KnifeBehaviour());
        king.fight();
        Character troll = new Troll();
        troll.fight();
    }

}
