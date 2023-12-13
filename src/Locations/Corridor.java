package Locations;

import Inventory.Inventory;

public class Corridor extends Location {
    public Corridor() {
        super(
            "corridor",
            new Inventory(),
            "You are going into the corridor. There is nothing to see here, just three very similar entrances, " +
                "the only difference being that the entrance on the left has a painting by Monet, " +
                "the entrance in the middle has a Picasso, and the entrance on the far right has a work by Titian."
        );
    }
}
