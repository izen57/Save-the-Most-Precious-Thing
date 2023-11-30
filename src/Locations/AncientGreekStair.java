package Locations;


import Inventory.MuseumMap;

public class AncientGreekStair extends Location {
    MuseumMap map = new MuseumMap();
    public AncientGreekStair() {
        super("ancient greek stair", null, "Now you are facing the headless goddess of victory, " +
                "with her wings spread out to both sides. On her left is the exhibition hall of Western painters," +
                "and on her right is the splendid Apollo Corridor. ");
    }
}
