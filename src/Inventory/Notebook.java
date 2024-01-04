package Inventory;

/**
 * Represents a Notebook item in the game.
 * This class extends {@link AbstractItem} class and provides a Notebook object for use within the game.
 */
public class Notebook extends AbstractItem implements IApplicable{

    /**
     * Constructs a Notebook item with name and description.
     * The name is set to "notebook" and a brief description is provided.
     */
    public Notebook() {
        super(
            "notebook",
            "This is a diary with a woman's name on the cover and " +
                "today's date on the last page."
        );
    }


    /**
     * Provides a specific message related to the Notebook.
     * This message includes information about the staff in the museum.
     * @return A string containing information about the staff in the museum.
     */
    @Override
    public String getMessage() {
        return "\"I'm so tired today. I really hope that sometimes " +
            "others can help me instead of me helping others all the time.\"";
    }
}
