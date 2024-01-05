package Inventory;

/**
 * This class extends {@link AbstractItem} class and provides a detailed newspaper object for use within the game.
 */
public class Newspaper extends AbstractItem {

    /**
     * Constructs a Newspaper item with a name and description.
     * The name is set to "newspaper", and the description includes a news article.
     */
    public Newspaper() {
        super(
            "newspaper",
            "This is a newspaper from a week ago. The front page reads, " +
                "'The Louvre will redistribute some of its exhibits. " +
                "Due to the expected increase in visitors and the poor condition of some storage areas, " +
                "the main museum in France and Paris plans to send some exhibits, mainly French painters and sculptors, for restoration. " +
                "Museum officials stated that they are willing to temporarily take the cats " +
                "that live in the museum buildings and that are so beloved by the public, " +
                "the staff is willing to temporarily take the four-legged creatures back to their homes.'"
        );
    }
}
