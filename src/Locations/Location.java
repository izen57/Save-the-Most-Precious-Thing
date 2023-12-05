package Locations;

import Inventory.AbstractItem;
import Inventory.Inventory;

public class Location {
    private String name;
    protected Inventory inventory;
    private String message;

    public Location(String name, String message) {
        this.name = name;
        this.inventory = new Inventory();
        this.message = message;
    }

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

    public void takeItem(AbstractItem itemFromLocation) {
        inventory.addItem(itemFromLocation);
    }

    public <T extends AbstractItem> T dropItem(String itemName)
    {
        T item = findItemByName(itemName);
        if (item != null)
            inventory.removeItem(itemName);

        return item;
    }

    /**
     * Find an item in the inner inventory by its name.
     * @param itemName an item to find.
     * @return an item of type <code>T</code> which must extends the {@link AbstractItem AbstractItem class } if there is it in the inventory, <code>null</code> otherwise.
     */
    public <T extends AbstractItem> T findItemByName(String itemName)
    {
        return inventory.findItemByName(itemName);
    }
}
