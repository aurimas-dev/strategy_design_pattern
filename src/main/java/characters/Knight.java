package characters;

import behaviours.SwordBehaviour;

public class Knight extends Character {

    public Knight() {
        weaponBehaviour = new SwordBehaviour();
    }

}
