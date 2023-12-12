package Locations;

import Inventory.Inventory;
import Inventory.MuseumMap;

public class AncientGreekStair extends Location {
    public AncientGreekStair() {
        super(
            "ancientGreekStair",
            new Inventory(),
            "You are facing the headless goddess of victory, " +
                "with her wings spread out to both sides. On her east is the exhibition hall of Egypt collections," +
                "and on her west is the splendid Apollo Corridor. Meanwhile, At her feet, there seemed to be a map left by someone else. "
        );
        MuseumMap map = new MuseumMap();
        addItem(map);
    }
}
