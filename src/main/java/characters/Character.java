package characters;

import behaviours.WeaponBehaviour;

public abstract class Character {

    WeaponBehaviour weaponBehaviour;

    public void fight() {
        weaponBehaviour.useWeapon();
    }

    public void setWeapon(WeaponBehaviour wb) {
        weaponBehaviour = wb;
    }

}
