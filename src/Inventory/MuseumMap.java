package Inventory;

public class MuseumMap extends ApplicableItem {
    public MuseumMap() {
        super("Map", "All the galleries run north-south. Opposite the Madonna of the Rocks is the entrance to the room where the Mona Lisa is stored.");
    }

    @Override
    public String getMessage()
    {
        return "All the galleries run north-south. Opposite the Madonna of the Rocks is the entrance to the room where the Mona Lisa is stored.";
    }
}