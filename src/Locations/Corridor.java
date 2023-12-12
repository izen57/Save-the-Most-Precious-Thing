package Locations;

import Inventory.Inventory;
import Inventory.Newspaper;

public class Corridor extends Location {
    public Corridor() {
        super(
            "corridor",
            new Inventory(),
            "You are moving to the corridor. In the corner next to the corridor, there is a rack with booklets about the history of the hall. " +
                    "There is a brand new newspaper on the booklet. " +
                    "Meanwhile,There are two different exits on the east and north sides of the corridor."
        );

        addItem(new Newspaper());
    }
}
