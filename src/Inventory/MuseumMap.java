package Inventory;

public class MuseumMap extends AbstractItem implements IApplicable {
    public MuseumMap() {
        super(
          "map",
          "This is a museum map, it has some guidelines."
        );
    }

    @Override
    public String getMessage()
    {
        return "The Mona Lisa painting is located in the northeast section of the museum. " +
            "Opposite the Madonna of the Rocks is the entrance to the room where the Mona Lisa is kept.";
    }
}
