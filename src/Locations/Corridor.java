package Locations;

import Inventory.Inventory;

public class Corridor extends Location {
    public Corridor() {
        super(
            "corridor",
            new Inventory(),
            "You are moving to the corridor. There is nothing to see here, only three very similar entrances. " +
                    "The only difference is that the entrance on the left has a painting by Monet, " +
                    "the entrance in the middle has a Picasso, and the far right has a work by Titian."
        );
    }
}
