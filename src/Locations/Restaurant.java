package Locations;

import Inventory.Inventory;

public class Restaurant extends Location {
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
