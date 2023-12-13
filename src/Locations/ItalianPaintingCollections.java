package Locations;

import Inventory.Inventory;

public class ItalianPaintingCollections extends Location {
    public ItalianPaintingCollections() {
        super(
            "italianPaintingCollections",
            new Inventory(),
            "It is filled with paintings by Italian painters, Titian, " +
                "Leonardo da Vinci, Caravaggio, but the important thing is " +
                "that you need to find the location of the Mona Lisa."
        );
  }
}
