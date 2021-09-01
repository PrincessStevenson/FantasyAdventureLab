package Enemies;

public abstract class Enemies {

    private String name;
    private int healthPoints;
    public int attackPlayer;
    public int takeDamage;

    public Enemies(String name, int healthPoints, int attackPlayer, int takeDamage){
        this.name = name;
        this.healthPoints = healthPoints;
        this.attackPlayer = attackPlayer;
        this.takeDamage = takeDamage;
    }


    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getAttackPlayer(){
        return attackPlayer;
    }

    public void enemiesKilled(Enemies enemies){

    }


}
