package Characters;

import Inventory.AbstractItem;
import Inventory.Inventory;
import Locations.Location;

/**
 * The class which represents the character including the {@link User user}, {@link NPC NPCs}, and {@link Friend friends}.
 * All characters have their own {@link Inventory inventory} and current {@link Location location}.
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
     * Adds an {@link AbstractItem item} to the character's {@link Inventory inventory}
     * and removes it from the inventory of the current {@link Location location}.
     * @param itemFromLocation the item to add.
     */
    public void takeItem(AbstractItem itemFromLocation) {
        inventory.addItem(itemFromLocation);
        currentLocation.removeItem(itemFromLocation.getName());

        System.out.println("You've just picked up "+ itemFromLocation.getName() +  " and now it is in your inventory.");
        System.out.println(itemFromLocation.getDescription());
    }

    /**
     * Removes an {@link AbstractItem item} from the character's {@link Inventory inventory}
     * and passes it to the current {@link Location location's} inventory.
     * @param itemName the item to drop.
     */
    public void dropItem(String itemName)
    {
        AbstractItem removedItem = inventory.findItemByName(itemName);
        if (removedItem != null) {
            inventory.removeItem(itemName);
            currentLocation.addItem(removedItem);
            System.out.println("You've dropped the " + itemName + '.');
        }
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
     * Finds an item in the character's {@link Inventory inventory} by its name.
     * @param itemName the name of the item to find.
     * @return an item of type {@code T} which must extends the {@link AbstractItem} if there is it in the inventory, {@code null} otherwise.
     * @param <T> the type parameter of needed item from the inventory which should be derived from the {@link AbstractItem}.
     */
    public <T extends AbstractItem> T findItemByName(String itemName) {
        return inventory.findItemByName(itemName);
    }

    public boolean isInventoryEmpty()
    {
        return inventory.isEmpty();
    }
}
