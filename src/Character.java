import Inventory.AbstractItem;
import Inventory.Inventory;
import Locations.Location;

import java.util.ArrayList;


public abstract class Character {
    protected Inventory inventory;
    private Location currentLocation;

    public Character(Inventory inventory, Location currentLocation) {
        this.inventory = inventory;
        this.currentLocation = currentLocation;
    }

    public  void takeItem(AbstractItem itemFromLocation){
        this.inventory.addItem(itemFromLocation);
    };
    public  void dropItem(AbstractItem item){
        this.inventory.removeItem(item.getName());
    };
    //public abstract void applyItem(IApplicable item);

    public boolean checkItem(AbstractItem item){
        return this.getInventory().contains(item);

    }

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




}
