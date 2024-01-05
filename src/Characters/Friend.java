package Characters;

import Inventory.Inventory;
import Locations.Location;

/**
 * The friend is the character located at a {@link Location location} and with a {@link Inventory inventory}.
 */
public class Friend extends Character implements NPC
{
    /**
     * Constructs a new Friend object with the specified {@link Inventory inventory} and {@link Location location}.
     * @param inventory The inventory associated with this Friend.
     * @param currentLocation  The current location of this Friend.
     */
    public Friend(Inventory inventory, Location currentLocation) {
        super(inventory, currentLocation);
    }

    /**
     * Retrieves a message from this Friend.
     * @return A string containing a message from this Friend.
     */
    public String getMessage() {
        return "Surprise! These two people are Yajing and Mikhail. " +
            "Yajing mentioned a delicious cake shop in Brussels called Yasushi Sasaki, " +
            "and Mikhail agreed. " +
            "Mikhail also enjoyed Café Georgette, which is located in the city center and serves" +
            " authentic Belgian cuisine.";
    }
}