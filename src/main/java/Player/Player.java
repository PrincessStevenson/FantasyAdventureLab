package Player;

import Game.Treasure;

import java.util.ArrayList;

public abstract class Player {
    private String name;
    private int healthPoints;
    private ArrayList<Treasure> bag;
    private PlayerType playerType;

    public Player(String name, int healthPoints, PlayerType playerType) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.playerType = playerType;
        this.bag = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }




}
