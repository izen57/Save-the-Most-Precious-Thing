import Inventory.Inventory;
import Inventory.Item;
import Locations.Location;

public class Staff extends Character{


    public Staff(Inventory inventory, Location currentLocation) {
        super(inventory, currentLocation);
    }

    @Override
    public void takeItem(Item itemFromLocation) {

    }

    @Override
    public void dropItem(Item item) {

    }
}
