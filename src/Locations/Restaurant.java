package Locations;

import Inventory.Inventory;

/**
 * This class extends the {@link Location} class, providing a specific setting within the game world.
 */
public class Restaurant extends Location {
    /**
     * Constructs a Restaurant {@link Location location} with a specific name, an empty {@link Inventory inventory}, and detailed descriptions.
     * The description sets the scene of the restaurant, mentioning {@link Characters.NPC} and a conversation between them.
     */
    public Restaurant() {
        super(
            "restaurant",
            new Inventory(),
            "This is a place for tourists to eat and rest. " +
                "It's important to note that two people are sitting nearby, having a conversation.",
            "The interior of the restaurant is very warm, " +
                "clean and comfortable, but it lacks the hustle and bustle of the past."
        );
    }
}
