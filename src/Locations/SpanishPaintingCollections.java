package Locations;

import Inventory.Inventory;

public class SpanishPaintingCollections extends Location {
    public SpanishPaintingCollections() {
        super(
            "spanishPaintingCollections",
            new Inventory(),
            "You are surrounded by the painting of the Spanish artist, there seems to be no sign of Monalisa. "
        );
    }


    public String getDescription(){
        return "To your east hangs a Venere di Urbino, and to your west hangs a giant water lily.";
    }


}
