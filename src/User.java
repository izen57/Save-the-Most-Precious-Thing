import Inventory.Item;
import Locations.Location;

import java.util.List;
import java.util.Stack;

public class User {
    private Location location;
    private List<Item> items;
    private Stack<Location> stack = new Stack<>();

    public User(Location location, List<Item> inventories) {
        this.location = location;
        this.items = inventories;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Item> getInventories() {
        return items;
    }

    public void setInventories(List<Item> inventories) {
        this.items = inventories;
    }
}

