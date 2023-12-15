package Locations;

import Inventory.Inventory;

public class Restaurant extends Location {
    public Restaurant() {
        super(
            "restaurant",
            new Inventory(),
            "This is a place for tourists to eat and rest, but it seems to be empty at the moment. How knows what may be if you enter \"tip\" here...",
            "The interior of the restaurant is very warm, " +
                "clean and comfortable, but it lacks the hustle and bustle of the past."
        );
    }
}
