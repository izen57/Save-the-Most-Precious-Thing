package Locations;

import Inventory.Inventory;

public class Restaurant extends Location{
    /**
     * Initialize the location with the given {@link Inventory inventory}.
     */
    public Restaurant() {
        super("restaurant", new Inventory(), "This is a place for tourists to eat and rest, but it seems that it is currently empty. But if you enter tips, there may be unexpected surprises.");
    }
}
