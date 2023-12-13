package Locations;

import Inventory.Inventory;

public class SpanishPaintingCollections extends Location {
        public SpanishPaintingCollections() {
            super(
                "spanishPaintingCollections",
                new Inventory(),
                "You are surrounded by the painting of the Spanish artists, " +
                    "there seems to be no sign of Monalisa."
            );
        }
}
