package Locations;

import Inventory.Inventory;


/**
 * This class extends the {@link Location} class, providing a specific setting within the game world.
 */
public class ApolloGallery extends Location {

    /**
     * Constructs an Apollo Gallery {@link Location location} with a specific name, empty {@link Inventory inventory}, message, and
     * description which is a hint about adjacent locations.
     */
    public ApolloGallery() {
        super(
            "apolloGallery",
            new Inventory(),
            "You have entered the Apollo Gallery, filled with dazzling jewelry and royal paraphernalia. " +
                     "The king's crown stands in the center. " +
                     "Signs to help visitors navigate their way point both north and east.",
            "There is a Monet painting hanging at the north exit, " +
                      "and the lights at the east exit are very bright."
        );
    }
}
