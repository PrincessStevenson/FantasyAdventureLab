package Player.Fighter;

import Behaviours.IWeapon;
import Enemies.Enemies;
import Player.Player;

public abstract class Fighter extends Player {

    private IWeapon iWeapon;

    public Fighter(String name, int healthPoints) {
        super(name, healthPoints);
    }
}
