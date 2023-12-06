package Locations;

import Inventory.AbstractItem;
import Inventory.Inventory;

/**
 * The class represents a location of the game.
 * Each location should have the name, the {@link Inventory inventory} and the entrance message which is printing when the user entrance the location.
 */
public class Location {
    private String name;
    protected Inventory inventory;
    private String message;

    /**
     * Initialize the location with an empty {@link Inventory inventory}.
     * @param name a name of the location.
     * @param message an entrance message.
     */
    public Location(String name, String message) {
        this.name = name;
        this.inventory = new Inventory();
        this.message = message;
    }

    /**
     * Initialize the location with the given {@link Inventory inventory}.
     * @param name a name of the location.
     * @param inventory an already created inventory.
     * @param message an entrance message.
     */
    public Location(String name, Inventory inventory, String message) {
        this.name = name;
        this.inventory = inventory;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Adds an {@link AbstractItem item} to the inventory of the location.
     * @param itemFromLocation an item to add.
     */
    public void takeItem(AbstractItem itemFromLocation) {
        inventory.addItem(itemFromLocation);
    }

    /**
     * Removes an {@link AbstractItem item} from the location.
     * @param itemName an item to remove.
     * @return an item of the given type parameter if it is presents in the inventory of the location, <code>null</code> otherwise.
     * @param <T> the type parameter of needed item from the location which should be derived from the {@link AbstractItem}.
     */
    public <T extends AbstractItem> T dropItem(String itemName)
    {
        return inventory.removeItem(itemName);
    }

    /**
     * Find an item on the location by its name.
     * @param itemName a name of the item to find.
     * @return an item of the given type parameter if it is presents in the inventory of the location, <code>null</code> otherwise.
     * @param <T> the type parameter of needed item from the inventory of the location which should be derived from the {@link AbstractItem}.
     */
    public <T extends AbstractItem> T findItemByName(String itemName)
    {
        return inventory.findItemByName(itemName);
    }
}
