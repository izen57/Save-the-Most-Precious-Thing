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
        return "Mona Lisa is in the northeast of the museum. " +
            "Opposite the Madonna of the Rocks is the entrance to the room where the Mona Lisa is kept.";
    }
}
