import Items.AbstractItem;
import Locations.Location;

import java.util.List;

public class User {
    private Location location;
    private List<AbstractItem> abstractItems;

    public User(Location location, List<AbstractItem> inventories) {
        this.location = location;
        this.abstractItems = inventories;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<AbstractItem> getInventories() {
        return abstractItems;
    }

    public void setInventories(List<AbstractItem> inventories) {
        this.abstractItems = inventories;
    }
}

