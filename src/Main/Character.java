package Main;

import Inventory.AbstractItem;
import Inventory.Inventory;
import Locations.Location;

/**
 * The class which represents the character including the {@link User user} and NPCs.
 * All characters have their own {@link Inventory inventory} and the {@link Location location}.
 */
public abstract class Character {
    protected Inventory inventory;
    private Location currentLocation;

    /**
     * Initializes an instance of the character with given the {@link Inventory inventory} and {@link Location location}.
     * @param inventory the given inventory.
     * @param currentLocation the given location.
     */
    public Character(Inventory inventory, Location currentLocation) {
        this.inventory = inventory;
        this.currentLocation = currentLocation;
    }

    /**
     * Adds an item to the character's {@link Inventory inventory}.
     * To grab an item from the location use this method with the {@link Location#removeItem(String)}.
     * @param itemFromLocation the item to add.
     */
    public void takeItem(AbstractItem itemFromLocation) {
        if (itemFromLocation != null)
            inventory.addItem(itemFromLocation);
    }

    /**
     * Removes an item to the character's {@link Inventory inventory} and drop it to the current {@link Location location}.
     * Use it with the {@link Location#addItem(AbstractItem)}.
     * @param itemName the item to drop.
     * @return an item of the given type parameter if it is presents in the character's inventory, <code>null</code> otherwise.
     * @param <T> the type parameter of needed item from the inventory which should be derived from the {@link AbstractItem}.
     */
    public <T extends AbstractItem> T dropItem(String itemName)
    {
        T removedItem =  inventory.removeItem(itemName);
        if (removedItem != null)
            currentLocation.addItem(removedItem);

        return removedItem;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }


    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    /**
     * Find an item in the character's inventory by its name.
     * @param itemName an item to find.
     * @return an item of type <code>T</code> which must extends the {@link AbstractItem AbstractItem class } if there is it in the inventory, <code>null</code> otherwise.
     */
    public <T extends AbstractItem> T findItemByName(String itemName){
        return inventory.findItemByName(itemName);
    }
}
