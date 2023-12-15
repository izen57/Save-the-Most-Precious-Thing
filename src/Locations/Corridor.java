package Locations;

import Inventory.Inventory;
import Inventory.Newspaper;

public class Corridor extends Location {
    public Corridor() {
        super(
            "corridor",
            new Inventory(),
            "Move into the hallway. In the corner next to the corridor is a shelf with " +
                "booklets about the history of the hall. " +
                "There is a brand new newspaper on the booklet. " +
                "There are now two different exits on the east and north sides of the corridor."
        );
        addItem(new Newspaper());
    }

    public String getDescription(){
        return "There is a Picasso painting hanging at the north exit, and the smell of coffee comes from the east exit.";
    }
}
