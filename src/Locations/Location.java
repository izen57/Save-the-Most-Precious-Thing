package Locations;

import Characters.*;
import Inventory.AbstractItem;
import Inventory.Inventory;

/**
 * The class represents a location of the game.
 * Each location should have the name, the {@link Inventory inventory}, the entrance message
 * which is printing when the user entrance the location, and the description which will be displayed when user input look.
 */
public abstract class Location {

    /** the name of the location*/
    private String name;

    /** the inventory of the location*/
    protected Inventory inventory;

    /** the message of the location*/
    protected String message;

    /** the description of the location*/
    private String description;

    /** the east adjacent location of this location*/
    private Location east;

    /** the west adjacent location of this location*/
    private Location west;

    /** the north adjacent location of this location*/
    private Location north;

    /** the south adjacent location of this location*/
    private Location south;

    /** the NPC located in this location*/
    private NPC npc;

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

    /**
     * get the name of this location.
     * @return location name.
     */
    public String getName() {
        return name;
    }

    /**
     * set the name of this location.
     * @param name location name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get the message associated with the location.
     * @return message associated with the location.
     */
    public String getMessage() {
        return message;
    }


    /**
     * get the east location related to current location.
     * @return  east location name.
     */
    public Location getEast() {
        return east;
    }

    /**
     * set the east location related to current location.
     * @param east location name.
     */
    public void setEast(Location east) {
        this.east = east;
    }

    /**
     * get the west location related to current location.
     * @return  west location name.
     */
    public Location getWest() {
        return west;
    }

    /**
     * set the west location related to current location.
     * @param west location name.
     */
    public void setWest(Location west) {
        this.west = west;
    }

    /**
     * get the north location related to current location.
     * @return  north location name.
     */
    public Location getNorth() {
        return north;
    }

    /**
     * set the north location related to current location.
     * @param north location name.
     */
    public void setNorth(Location north) {
        this.north = north;
    }


    /**
     * get the south location related to current location.
     * @return  south location name.
     */
    public Location getSouth() {
        return south;
    }


    /**
     * set the south location related to current location.
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
     * Check if location's {@link Inventory inventory} is empty or not.
     * @return true if it is empty, otherwise false.
     */
    public boolean isEmpty()
    {
        return inventory.isEmpty();
    }

    /**
     * Get the {@link NPC} npc located at current location.
     * @return NPC located at current location.
     */
    public NPC getCharacter() {
        return this.npc;
    }

    /**
     * Set the {@link NPC} npc located at current location.
     * @param character located at current location.
     */
    public void placeCharacter(NPC character) {
         this.npc = character;
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

    /**
     * Get description of current location.
     * @return description associated with location.
     */
    public String getDescription()
    {
        return description;
    }
}
