package org.example;

public class DISB extends Troop{

    public DISB(String title, int count, int strength) {
        super(title, count, strength);
    }

    @Override
    public int getTroopStrength() {
        int weapon = 10;
        return count * (strength + weapon);
    }


}
