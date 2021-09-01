package Player.Fighter;

import Behaviours.IWeapon;

public class Barbarian extends Fighter {

    private int power;

    public Barbarian(String name, int healthPoints, IWeapon iWeapon) {
        super(name, healthPoints);
    }
}
