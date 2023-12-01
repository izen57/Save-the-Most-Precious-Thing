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

    public abstract void takeItem(AbstractItem itemFromLocation);
    public abstract void dropItem(AbstractItem item);
    //public abstract void applyItem(IApplicable item);


    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }


    public String getCurrentLocation() {
        return currentLocation.getName();
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public boolean checkItem(AbstractItem item){
        return inventory.contains(item);
    }
}
