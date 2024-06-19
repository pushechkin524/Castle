package org.example;

import java.util.ArrayList;
import java.util.Objects;

public class Army {

    private String title;
    private int count;
    private ArrayList<Troop> troops = new ArrayList<>() {{
        add(new DISB("AAA", 101, 12));
        add(new DISB("BBB", 122, 13));
        add(new CommonTroop("CCC", 810, 5));
    }};

    public Army(String title, int count) {
        this.title = title;
        this.count = count;
    }

    public void addNewTroop(Troop troop) {
        boolean found = false;

        ArrayList<Troop> newTroops = new ArrayList<>();
        for (Troop t : troops) {
            if (Objects.equals(troop.getTitle(), t.getTitle()) && t.getStrength() == troop.getStrength()) {
                t.addCount(troop.getCount());
                found = true;
                break;
            }
        }
        if (!found) {
            newTroops.add(troop);
        }
        troops.addAll(newTroops);
    }

    public int getAllArmySize() {
        int total = 0;
        for (Troop t: troops) {
            total += t.getCount();
        }
        return total * count;
    }

    public int getAllArmyStrength() {
        int total = 0;
        for (Troop t: troops) {
            total += t.getCount() * t.getStrength();
        }
        return total * count;
    }

}
