package Player;

import Game.Treasure;

import java.util.ArrayList;

public abstract class Player {
    private String name;
    private int healthPoints;
    private ArrayList<Treasure> bag;

    public Player(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.bag = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public ArrayList<Treasure> getBag() {
        return bag;
    }


}
