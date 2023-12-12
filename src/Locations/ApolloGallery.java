package Locations;

import Inventory.Inventory;

public class ApolloGallery extends Location {
    public ApolloGallery() {
        super(
            "apolloGallery",
            new Inventory(),
            "You entered the Apollo Gallery, it is filled with dazzling jewelry and royal utensils." +
                "  The king's crown stands in the center.  " +
                "Signs to help visitors navigate their way point both north and east. "
        );
    }
}
