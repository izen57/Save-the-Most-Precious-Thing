import Inventory.Inventory;
import Locations.Location;
import Inventory.Item;


public abstract class Character {
    private Inventory inventory;
    private Location currentLocation;

    public Character(Inventory inventory, Location currentLocation) {
        this.inventory = inventory;
        this.currentLocation = currentLocation;
    }

    public abstract void takeItem(Item itemFromLocation);
    public abstract void dropItem(Item item);
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


}
