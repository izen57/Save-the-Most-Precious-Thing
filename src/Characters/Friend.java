package Characters;

import Inventory.Inventory;
import Locations.Location;

public class Friend extends Character implements NPC
{
    public Friend(Inventory inventory, Location currentLocation) {
        super(inventory, currentLocation);
    }

    public String getMessage() {
        return "Surprise! These two people are Yajing and Mikhail. " +
            "Yajing mentioned a delicious cake shop in Brussels called Yasushi Sasaki, " +
            "and Mikhail agreed. " +
            "Mikhail also enjoyed Café Georgette, which is located in the city center and serves" +
            "authentic Belgian cuisine.";
    }
}