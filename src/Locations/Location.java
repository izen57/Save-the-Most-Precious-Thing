package Locations;

import Characters.NPC;
import Characters.User;
import Inventory.AbstractItem;
import Inventory.Inventory;

/**
 * The class represents a location of the game.
 * Each location should have the name, the {@link Inventory inventory}, the entrance message
 * which is printing when the {@link User user} entrance the location, and the description which will be displayed when user inputs {@code look}.
 */
public abstract class Location {

    /** The name of the location*/
    private String name;

    /** The {@link Inventory inventory} of the location*/
    protected Inventory inventory;

    /** The message of the location*/
    protected String message;

    /** The description of the location*/
    private String description;

    /** The east adjacent location of this location*/
    private Location east;

    /** The west adjacent location of this location*/
    private Location west;

    /** The north adjacent location of this location*/
    private Location north;

    /** The south adjacent location of this location*/
    private Location south;

    /** The {@link NPC} located in this location*/
    private NPC npc;

    /**
     * Initializes the location with the given {@link Inventory inventory}.
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

    /**
     * Gets the name of this location.
     * @return location name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of this location.
     * @param name location name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the message associated with the location.
     * @return message associated with the location.
     */
    public String getMessage() {
        return message;
    }

    /**
     * Gets the east location related to current location.
     * @return east location name.
     */
    public Location getEast() {
        return east;
    }

    /**
     * Sets the east location related to current location.
     * @param east location name.
     */
    public void setEast(Location east) {
        this.east = east;
    }

    /**
     * Gets the west location related to current location.
     * @return  west location name.
     */
    public Location getWest() {
        return west;
    }

    /**
     * Sets the west location related to current location.
     * @param west location name.
     */
    public void setWest(Location west) {
        this.west = west;
    }

    /**
     * Gets the north location related to current location.
     * @return  north location name.
     */
    public Location getNorth() {
        return north;
    }

    /**
     * Sets the north location related to current location.
     * @param north location name.
     */
    public void setNorth(Location north) {
        this.north = north;
    }

    /**
     * Gets the south location related to current location.
     * @return south location name.
     */
    public Location getSouth() {
        return south;
    }

    /**
     * Sets the south location related to current location.
     * @param south location name.
     */
    public void setSouth(Location south) {
        this.south = south;
    }

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

    /**
     * Checks if location's {@link Inventory inventory} is empty or not.
     * @return {@code true} if it is empty, {@code false} otherwise.
     */
    public boolean isEmpty()
    {
        return inventory.isEmpty();
    }

    /**
     * Gets the {@link NPC} located at current location.
     * @return NPC located at current location.
     */
    public NPC getCharacter() {
        return this.npc;
    }

    /**
     * Sets the {@link NPC} npc located at current location.
     * @param character located at current location.
     */
    public void placeCharacter(NPC character) {
         this.npc = character;
    }

    /**
     * Finds an item on the location by its name.
     * @param itemName a name of the item to find.
     * @return an item of the given type parameter if it presents in the inventory of the location, {@code null} otherwise.
     * @param <T> the type parameter of needed item from the inventory of the location which should be derived from the {@link AbstractItem}.
     */
    public <T extends AbstractItem> T findItemByName(String itemName)
    {
        return inventory.findItemByName(itemName);
    }

    /**
     * Gets the description of current location.
     * @return description associated with location.
     */
    public String getDescription()
    {
        return description;
    }
}
