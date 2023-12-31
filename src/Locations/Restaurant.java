package Locations;

import Inventory.Inventory;

public class Restaurant extends Location {
    public Restaurant() {
        super(
            "restaurant",
            new Inventory(),
            "This is a place for tourists to eat and rest. It is worth noting that there are two people sitting not far from you, talking about something.",
            "The interior of the restaurant is very warm, " +
                "clean and comfortable, but it lacks the hustle and bustle of the past."
        );

    }
}
