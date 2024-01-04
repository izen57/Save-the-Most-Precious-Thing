package Characters;

import Inventory.IApplicable;
import Inventory.Inventory;
import Locations.Location;
import Main.TimeCounter;

import java.util.Stack;

/**
 * The user is the character with the {@link Stack stack} of the history of {@link Location locations} he visited.
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

    public Location showLastLocation() {
        return this.locationHistory.peek();
    }

    public void showInventory()
    {
        inventory.showInventory();
    }

    public void move(String direction){
        addLocation(getCurrentLocation());
        if(direction.equals("north")) {
            this.setCurrentLocation(getCurrentLocation().getNorth());
        } else if (direction.equals("south")) {
            this.setCurrentLocation(getCurrentLocation().getSouth());
        } else if (direction.equals("east")) {
            this.setCurrentLocation(getCurrentLocation().getEast());
        }else if (direction.equals("west")) {
            this.setCurrentLocation(getCurrentLocation().getWest());
        }
        System.out.println(getCurrentLocation().getMessage());

        TimeCounter.takeSteps();
    }
}
