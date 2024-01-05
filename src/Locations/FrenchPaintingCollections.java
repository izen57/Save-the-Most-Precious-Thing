package Locations;

import Inventory.Inventory;
import Inventory.Notebook;


/**
 * This class extends the {@link Location} class, providing a specific setting within the game world.
 */
public class FrenchPaintingCollections extends Location {

    /**
     * Constructs an French Painting Collection {@link Location location} with a specific name, empty {@link Inventory inventory}, and
     * message which is a hint about adjacent locations.
     */
    public FrenchPaintingCollections() {
        super(
            "frenchPaintingCollections",
            new Inventory(),
            "You are surrounded by the painting of French artist, there seems no sign of Monalisa. " +
                "To your east, there is a corridor to go to the collections of other countries.",
            null
        );

    }

    /**
     * Overrides the original method to provide different descriptions in different situations.
     * If the {@link Location location} is not empty the description mentions the presence of a {@link Notebook notebook}.
     * @return A string containing the description of the current location and notable items.
     */
    @Override
    public String getDescription() {
        if (!isEmpty())
            return "On your left, there is a leather notebook lies quietly at your feet.";
        else
            return "To your east, there is a corridor to go to the collections of other countries.";
    }

}
