package Locations;

import Inventory.Inventory;
import Inventory.MuseumMap;

public class AncientGreekStair extends Location {
    public AncientGreekStair() {
        super(
            "ancientGreekStair",
            new Inventory(),
            null,
            "There are only two exits here: one to the east and one to the west."
        );
    }

    @Override
    public String getMessage() {
        message = "You are standing before the headless Goddess of Victory, " +
            "with her wings outstretched on either side. " +
            "On her east is the Egypt Exhibition Hall, " +
            "and on her west is the splendid Apollo Corridor.";

        if (!isEmpty())
            message += " Meanwhile, at her feet there seems to be a map left by someone else.";

        return message;
    }
}
