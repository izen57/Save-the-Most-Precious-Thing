package Locations;

import Inventory.Inventory;
import Inventory.Newspaper;

public class FrenchPaintingCollections extends Location {

    public FrenchPaintingCollections() {
        super(
            "frenchPaintingCollections",
            new Inventory(),
            "You are surrounded by the painting of the French artists, there seems to be no sign of Monalisa, " +
            "on your right there is a corridor to go to the collections of other countries."
        );
        addItem(new Newspaper());
    }
}
