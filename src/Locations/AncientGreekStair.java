package Locations;

import Inventory.Inventory;
import Inventory.MuseumMap;

public class AncientGreekStair extends Location {
    public AncientGreekStair() {
        super(
            "ancientGreekStair",
            new Inventory(),
            "You stand before the headless Goddess of Victory, " +
                "with her wings outstretched on either side. On her left is the Western Painters' Exhibition Hall, " +
                "and on her right is the magnificent Apollo Corridor. Meanwhile, at her feet there seems to be a map left by someone else."
        );
        addItem(new MuseumMap());
    }
}
