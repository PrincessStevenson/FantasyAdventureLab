package Game;

import java.util.ArrayList;

public abstract class Game {
    private ArrayList<Treasure> treasures;

    public Game(ArrayList<Treasure> treasures){
        this.treasures = treasures;
    }

    public int getAmountOfTreasure(){
        return treasures.size();
    }
}
