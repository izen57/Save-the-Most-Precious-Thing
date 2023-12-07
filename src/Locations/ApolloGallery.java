package Locations;

import Inventory.Inventory;

public class ApolloGallery extends Location {
    public ApolloGallery() {
        super(
            "apolloGallery",
            new Inventory(),
            "You entered the Apollo Gallery, it is filled with dazzling jewelry and royal utensils." +
                " Sapphires shine with pure light. The king's crown stands in the center. " +
                "There is an exit that turns right at the end of the gallery... "
        );
    }
}
