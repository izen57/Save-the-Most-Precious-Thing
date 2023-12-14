package Inventory;

public class MuseumMap extends AbstractItem implements IApplicable {
    public MuseumMap() {
        super(
          "map",
          "This is a museum map, it seems to have some guidelines."
        );
    }

    @Override
    public String getMessage()
    {
        return "All the galleries run north-south. Opposite the Madonna of the Rocks is the entrance to the room where the Mona Lisa is stored.";
    }
}
