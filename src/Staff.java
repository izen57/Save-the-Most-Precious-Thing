import Inventory.AbstractItem;
import Inventory.Inventory;
import Locations.Location;

public class Staff extends Character{


    public Staff(Inventory inventory, Location currentLocation) {
        super(inventory, currentLocation);
    }

    @Override
    public void takeItem(AbstractItem itemFromLocation) {

    }

    @Override
    public void dropItem(AbstractItem item) {

    }
}
