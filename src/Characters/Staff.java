package Characters;

import Inventory.*;
import Locations.Location;

public class Staff extends Character implements NPC
{
    public Staff(Inventory inventory, Location currentLocation) {
        super(inventory, currentLocation);
    }

    @Override
    public String getMessage() {
        return null;
    }
}
