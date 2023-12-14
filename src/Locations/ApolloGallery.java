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
    public String getDescription(){
        return "There is a Monet painting hanging at the north exit, and the lights at the east exit are very bright.";
    }
}
