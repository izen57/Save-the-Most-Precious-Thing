import Inventory.Inventory;
import Inventory.Item;
import Locations.Location;

import java.util.Stack;

public class User extends Character {
    private Stack<Location> locationHistory = new Stack<>();

    public User(Inventory inventory, Location currentLocation) {
        super(inventory, currentLocation);
    }


    public Stack<Location> getLocationHistory() {
        return locationHistory;
    }

    public void setLocationHistory(Stack<Location> locationHistory) {
        this.locationHistory = locationHistory;
    }


//    @Override
//    public Location
    @Override
    public void takeItem(Item itemFromLocation) {
        this.getInventory().addItem(itemFromLocation);

    }

    @Override
    public void dropItem(Item item) {
        this.getInventory().removeItem(item);

    }

    public String applyItem(Item item){
        return item.getMessage();
    }

    public void addLocation(Location location){
        this.locationHistory.push(location);
    }

    public void removeLocation(){
        this.locationHistory.pop();
    }

    public Location showLastLocation(){
        return this.locationHistory.peek();

    }
}

