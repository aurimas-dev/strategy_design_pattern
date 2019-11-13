package characters;

import behaviours.BowAndArrowBehaviour;

public class Troll extends Character {

    public Troll() {
        weaponBehaviour = new BowAndArrowBehaviour();
    }

}
