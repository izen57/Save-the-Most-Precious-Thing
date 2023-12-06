import Inventory.AbstractItem;
import Inventory.Inventory;
import Locations.Location;


public abstract class Character {
    protected Inventory inventory;
    private Location currentLocation;

    public Character(Inventory inventory, Location currentLocation) {
        this.inventory = inventory;
        this.currentLocation = currentLocation;
    }

    public void takeItem(AbstractItem itemFromLocation) {
        inventory.addItem(itemFromLocation);
    }

    public <T extends AbstractItem> T dropItem(String itemName)
    {
        return inventory.removeItem(itemName);
    }
    //public abstract void applyItem(IApplicable item);


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
     * Find an item in the inner inventory by its name.
     * @param itemName an item to find.
     * @return an item of type <code>T</code> which must extends the {@link AbstractItem AbstractItem class } if there is it in the inventory, <code>null</code> otherwise.
     */
    public <T extends AbstractItem> T findItemByName(String itemName){
        return inventory.findItemByName(itemName);
    }
}
