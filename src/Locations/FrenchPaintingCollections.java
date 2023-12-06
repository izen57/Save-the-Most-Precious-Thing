package Locations;

import Inventory.Newspaper;

public class FrenchPaintingCollections extends Location {

    public FrenchPaintingCollections() {
        super(
            "frenchPaintingCollections",
            "You are surrounded by the painting of french artist, there seems no sign of Monalisa. " +
            "In your right, there is a corridor to go to collections of other countries."
        );
        addItem(new Newspaper());
    }
}
