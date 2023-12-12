package Locations;

import Inventory.Inventory;
import Inventory.Newspaper;

public class FrenchPaintingCollections extends Location {

    public FrenchPaintingCollections() {
        super(
            "frenchPaintingCollections",
            new Inventory(),
            "You are surrounded by the painting of french artist, there seems no sign of Monalisa. " +
            "to your east, there is a corridor to go to collections of other countries."
        );
    }
}
