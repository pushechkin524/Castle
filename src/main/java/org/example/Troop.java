package org.example;

public abstract class Troop {

    protected String title;
    protected int count;
    protected int strength;

    public Troop(String _title, int _count, int _strength) {
        title = _title;
        count = _count;
        strength = _strength;
    }

    protected String getTitle() {
        return title;
    }

    protected  int getStrength() {
        return strength;
    }

    protected int getCount() {
        return count;
    }

    protected void addCount(int count) {
        this.count += count;
    }

    public abstract int getTroopStrength();

}
