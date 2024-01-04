package Characters;

import Inventory.Inventory;
import Locations.Location;
import Main.TimeCounter;

import java.util.Stack;

/**
 * The User class extends the {@link Character} class and is characterized by a history of locations visited,
 * which is tracked using a {@link Stack} of {@link Location} objects. This class manages the user's
 * movements, {@link Inventory inventory}, and interactions with game items.
 */
public class User extends Character {
    private Stack<Location> locationHistory = new Stack<>();

    /**
     * Constructs a User with specified {@link Inventory inventory} and current {@link Location location}.
     * @param inventory The inventory associated with the User.
     * @param currentLocation The User's current location in the game.
     */
    public User(Inventory inventory, Location currentLocation) {
        super(inventory, currentLocation);
    }

    /**
     * Gets the history of {@link Location locations} visited by the User.
     * @return A stack of Location objects representing the User's location history.
     */
    public Stack<Location> getLocationHistory() {
        return locationHistory;
    }

    /**
     * Sets the history of {@link Location locations} for the User.
     * @param locationHistory A stack of Location objects representing the new location history.
     */
    public void setLocationHistory(Stack<Location> locationHistory) {
        this.locationHistory = locationHistory;
    }

    /**
     * Adds a new {@link Location location} to the User's location history.
     * @param location  The new Location to be added to the history.
     */
    public void addLocation(Location location){
        this.locationHistory.push(location);
    }

    /**
     * Removes the most recent {@link Location location} from the User's location history.
     */
    public void removeLocation() {
        this.locationHistory.pop();
    }

    /**
     * Shows the last {@link Location location} visited by the User.
     * @return The most recent Location object from the location history.
     */
    public Location showLastLocation() {
        return this.locationHistory.peek();
    }

    /**
     * Displays the User's current {@link Inventory inventory}.
     */
    public void showInventory() {
        inventory.showInventory();
    }

    /**
     * Moves the User in a specified direction and updates the {@link Location location} history.
     * The method also prints the message of the new current location and updates the game's {@link TimeCounter time counter}.
     * @param direction The direction in which to move the User.
     */
    public void move(String direction) {
        addLocation(getCurrentLocation());
        switch (direction) {
            case "north":
                this.setCurrentLocation(getCurrentLocation().getNorth());
                break;
            case "south":
                this.setCurrentLocation(getCurrentLocation().getSouth());
                break;
            case "east":
                this.setCurrentLocation(getCurrentLocation().getEast());
                break;
            case "west":
                this.setCurrentLocation(getCurrentLocation().getWest());
                break;
        }
        System.out.println(getCurrentLocation().getMessage());
        TimeCounter.takeSteps();
    }
}
