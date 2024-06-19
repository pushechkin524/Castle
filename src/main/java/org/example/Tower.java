package org.example;

public class Tower {

    private String direction;
    private int health;

    public int getHealth() {
        return health;
    }

    public String getDirection() {
        return direction;
    }

    public Tower(String direction, int health) {
        this.direction = direction;
        this.health = health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
