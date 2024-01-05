package Locations;

import Inventory.Inventory;

/**
 * This class extends the {@link Location} class, providing a specific setting within the game world.
 */
public class AncientGreekStair extends Location {

    /**
     * Constructs an Ancient Greek Stair {@link Location location} with a specific name, empty {@link Inventory inventory}, and
     * description which is a hint about adjacent locations.
     */
    public AncientGreekStair() {
        super(
            "ancientGreekStair",
            new Inventory(),
            null,
            "There are only two exits here: one to the east and one to the west."
        );
    }

    /**
     * Overrides the original method to provide different messages in different situations.
     * If the location is not empty the message mentions the presence of a map at the feet of the statue.
     * @return A string containing the description of the current {@link Location location} and notable items.
     */
    @Override
    public String getMessage() {
        message = "You are standing before the headless Goddess of Victory, " +
            "with her wings outstretched on either side. " +
            "On her east is the Egypt Exhibition Hall, " +
            "and on her west is the splendid Apollo Corridor.";

        if (!isEmpty())
            message += " Meanwhile, at her feet there seems to be a map left by someone else.";

        return message;
    }
}
