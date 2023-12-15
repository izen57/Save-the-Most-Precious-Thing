package Locations;

import Inventory.AbstractItem;
import Inventory.Inventory;

/**
 * The class represents a location of the game.
 * Each location should have the name, the {@link Inventory inventory}, the entrance message
 * which is printing when the user entrance the location, and the description which will be displayed by the map, for instance.
 */
public abstract class Location {
    private String name;
    protected Inventory inventory;
    private String message;
    private String description;
    private Location east;
    private Location west;
    private Location north;
    private Location south;

    /**
     * Initialize the location with the given {@link Inventory inventory}.
     *
     * @param name        a name of the location.
     * @param inventory   an already created inventory.
     * @param message     an entrance message.
     * @param description a message which is provided by the map
     */
    public Location(String name, Inventory inventory, String message, String description) {
        this.name = name;
        this.inventory = inventory;
        this.message = message;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inventory getInventory() {
        return inventory;
    }
    public String getMessage() {
        return message;
    }

    public Location getEast() {
        return east;
    }

    public void setEast(Location east) {
        this.east = east;
    }

    public Location getWest() {
        return west;
    }

    public void setWest(Location west) {
        this.west = west;
    }

    public Location getNorth() {
        return north;
    }

    public void setNorth(Location north) {
        this.north = north;
    }

    public Location getSouth() {
        return south;
    }

    public void setSouth(Location south) {
        this.south = south;
    }

    //abstract public String getDescription();

    /**
     * Adds an {@link AbstractItem item} to the location's {@link Inventory inventory}.
     * @param item an item to add.
     */
    public void addItem(AbstractItem item) {
        inventory.addItem(item);
    }

    /**
     * Removes an {@link AbstractItem item} from the location's {@link Inventory inventory}.
     * @param itemName an item to remove.
     */
    public void removeItem(String itemName)
    {
        inventory.removeItem(itemName);
    }

    public boolean isEmpty()
    {
        return inventory.isEmpty();
    }

    /**
     * Finds an item on the location by its name.
     * @param itemName a name of the item to find.
     * @return an item of the given type parameter if it is presents in the inventory of the location, {@code null} otherwise.
     * @param <T> the type parameter of needed item from the inventory of the location which should be derived from the {@link AbstractItem}.
     */
    public <T extends AbstractItem> T findItemByName(String itemName)
    {
        return inventory.findItemByName(itemName);
    }

    public String getDescription()
    {
        return description;
    }
}
