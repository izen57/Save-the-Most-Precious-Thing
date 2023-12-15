package Locations;

import Inventory.AbstractItem;
import Inventory.Inventory;

/**
 * The class represents a location of the game.
 * Each location should have the name, the {@link Inventory inventory} and the entrance message which is printing when the user entrance the location.
 */
public abstract class Location {
    private String name;
    protected Inventory inventory;
    private String message;
    private Location east;
    private Location west;

    private Location north;
    private Location south;

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

    /**
     * Adds an {@link AbstractItem item} to the inventory of the location.
     * @param item an item to add.
     */
    public void addItem(AbstractItem item) {
        inventory.addItem(item);
    }

    /**
     * Removes an {@link AbstractItem item} from the location.
     * @param itemName an item to remove.
     * @return an item of the given type parameter if it is presents in the inventory of the location, {@code null} otherwise.
     */
    public void removeItem(String itemName)
    {
        inventory.removeItem(itemName);
    }

    public boolean isEmpty(){
        if(inventory.getStorage() == null){
            return true;
        }else{
            return false;
        }


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

    abstract public String getDescription();




}
