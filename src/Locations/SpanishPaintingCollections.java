package Locations;

import Inventory.Inventory;

/**
 * This class extends the {@link Location} class, providing a specific setting within the game world.
 */
public class SpanishPaintingCollections extends Location {

    /**
     * Constructs a Spanish Painting Collection {@link Location location} with a specific name, empty {@link Inventory inventory}, message and
     *  description which is a hint about adjacent locations.
     */
    public SpanishPaintingCollections() {
        super(
            "spanishPaintingCollections",
            new Inventory(),
            "You are surrounded by the painting of the Spanish artist, there seems to be no sign of Monalisa. ",
            "To your east hangs a Venere di Urbino, and to your west hangs a giant water lily."
        );
    }
}
