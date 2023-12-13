package Locations;

import Inventory.Inventory;

public class ApolloGallery extends Location {
    public ApolloGallery() {
        super(
            "apolloGallery",
            new Inventory(),
            "You have entered the Apollo Gallery, filled with dazzling jewelry and royal paraphernalia." +
                " The king's crown stands in the center. " +
                "Signs to help visitors navigate their way point both north and east."
        );
    }
}
