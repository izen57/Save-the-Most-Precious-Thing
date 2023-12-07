package Main;

import Inventory.IApplicable;
import Inventory.Inventory;
import Locations.Location;

import java.util.Stack;

/**
 * The user is the character with the stack of the history of locations he visited.
 */
public class User extends Character
{
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

    public String applyItem(IApplicable item){
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

    public String moveForward(Location current, Location last){
        this.setCurrentLocation(current);
        this.addLocation(last);
        System.out.println(current.getMessage());
        return current.getName();
    }

    public String moveBack(){
        this.setCurrentLocation(this.showLastLocation());
        System.out.println(this.showLastLocation().getMessage());
        this.removeLocation();
        return this.getCurrentLocation();
    }
}
