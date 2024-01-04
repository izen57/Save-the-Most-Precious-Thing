package Inventory;

/**
 * This class extends {@link AbstractItem} class and implements the {@link IApplicable} interface.
 * The Museum Map is a specialized item that provides guidance within the museum.
 */
public class MuseumMap extends AbstractItem implements IApplicable {

    /**
     * Constructs a MuseumMap item with name and description.
     */
    public MuseumMap() {
        super(
          "map",
          "This is a museum map, it has some guidelines."
        );
    }

    /**
     * Provides a specific message related to the Museum Map.
     * This message includes information about the location of Mona Lisa within the museum.
     * @return A string containing information about the museum.
     */
    @Override
    public String getMessage()
    {
        return "The Mona Lisa painting is located in the northeast section of the museum. " +
            "Opposite the Madonna of the Rocks is the entrance to the room where the Mona Lisa is kept.";
    }
}
