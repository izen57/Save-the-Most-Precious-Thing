package Locations;

import Inventory.Inventory;

/**
 * This class extends the{@link Location} class, providing a specific setting within the game world.
 */
public class ItalianPaintingCollections extends Location {

    /**
     * Constructs an Italian Painting Collection location with a specific name, empty inventory, same message and description
     * as a hint about finding the right place of Mona Lisa.
     */
    public ItalianPaintingCollections() {
        super(
            "italianPaintingCollections",
            new Inventory(),
            "It is filled with paintings by Italian painters, Titian, " +
                "Leonardo da Vinci, Caravaggio, but the important thing is " +
                "that you need to find the location of the Mona Lisa.",
            "It is filled with paintings by Italian painters, Titian, " +
                "Leonardo da Vinci, Caravaggio, but the important thing is " +
                "that you need to find the location of the Mona Lisa."
        );
    }
}
