package org.example;

public class CommonTroop extends Troop {

    public CommonTroop(String title, int count, int strength) {
        super(title, count, strength);
    }

    @Override
    public int getTroopStrength() {
        return count * strength;
    }


}
