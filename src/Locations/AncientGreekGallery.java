package Locations;


import Inventory.Inventory;

public class AncientGreekGallery extends Location {
    public AncientGreekGallery() {
        super(
            "ancientGreekGallery",
            new Inventory(),
            "Now you have entered the Denon Hall and walked straight into the corridor filled with ancient Greek sculptures. " +
                "to your south is the statue of Venus with a broken arm. ",
            "Venus is at the end of the corridor, facing the long corridor and " +
                "quietly overlooking the countless worldly people passing by."
        );
    }
}
