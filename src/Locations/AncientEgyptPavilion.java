package Locations;

import Inventory.Inventory;

/**
 * This class extends the{@link Location} class, providing a specific setting within the game world.
 */
public class AncientEgyptPavilion extends Location{

    /**
     * Constructs an Ancient Egypt Pavilion location with a specific name, empty inventory, message and
     * description which is a hint about an adjacent location.
     */
    public AncientEgyptPavilion() {
        super(
            "ancientEgyptPavilion",
            new Inventory(),
            "You entered the ancient egypt pavilion. It is dark here, with the huge Sphinx of ancient Egypt and the mysterious mummies.",
            "There seems to be a bright place to the north of it."
        );
    }
}
