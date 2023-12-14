package Main;

import Inventory.Inventory;
import Locations.Location;

public class Staff extends Character
{
    public Staff(Inventory inventory, Location currentLocation) {
        super(new Inventory(), currentLocation);
    }
}
