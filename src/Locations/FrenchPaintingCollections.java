package Locations;

import Inventory.Newspaper;

public class FrenchPaintingCollections extends Location {

    public FrenchPaintingCollections() {
        super(
            "frenchPaintingCollections",
            "You are surrounded by the painting of french artist, there seems no sign of Monalisa. " +
            "In your right, there is a corridor to go to collections of other countries." +
            "In the corner of the hall you see a rack with booklets about the history of the hall."
        );
        super.inventory.addItem(new Newspaper());
    }
}
