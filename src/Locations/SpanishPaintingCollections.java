package Locations;

import Inventory.Inventory;

public class SpanishPaintingCollections extends Location {
        public SpanishPaintingCollections() {
            super("spanishPaintingCollections", new Inventory(), "you are surrounded by the painting of Spanish artist, there seems no sign of Monalisa." +
                    "However, to the east of you, there is a painting by Titian right in front of you.");
        }
}
