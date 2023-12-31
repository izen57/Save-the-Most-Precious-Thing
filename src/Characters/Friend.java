package Characters;

import Inventory.Inventory;
import Locations.Location;

public class Friend extends Character implements NPC
{
    public Friend(Inventory inventory, Location currentLocation) {
        super(inventory, currentLocation);
    }

    public String getMessage(){
        return "Surprise! it turns out that these two people are Yajing and Mikhail. Yajing said that there is a very delicious cake shop in Brussels called Yasushi Sasaki and Mikhail said";

    }
}