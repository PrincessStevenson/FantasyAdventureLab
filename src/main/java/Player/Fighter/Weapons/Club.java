package Player.Fighter.Weapons;

import Behaviours.IWeapon;
import Enemies.Enemies;

public class Club implements IWeapon {

    public void attack(Enemies enemies){
        enemies.takeDamage(2);
    }
}
