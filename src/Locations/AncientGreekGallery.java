package Locations;


import Inventory.Inventory;

/**
 * This class extends the {@link Location} class, providing a specific setting within the game world.
 */
public class AncientGreekGallery extends Location {
    /**
     * Constructs an Ancient Greek Gallery {@link Location location} with a specific name, empty {@link Inventory inventory}, message, and
     * description which is a hint about an adjacent location.
     */
    public AncientGreekGallery() {
        super(
            "ancientGreekGallery",
            new Inventory(),
            "Now you have entered the Denon Hall and walked straight into the corridor filled with ancient Greek sculptures. " +
                     "To your south is the statue of Venus with a broken arm.",
            "Venus is at the end of the corridor, facing the long corridor and " +
                      "quietly overlooking the countless worldly people passing by."
        );
    }
}
