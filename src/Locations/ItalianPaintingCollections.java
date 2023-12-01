package Locations;

import Inventory.Key;

public class ItalianPaintingCollections extends Location {
    public ItalianPaintingCollections() {
        super("italianPaintingCollections", "It is filled with paintings by Italian painters, Titian, Leonardo da Vinci, Caravaggio, but the important thing is that you need to find the location of the Mona Lisa.");
        super.inventory.addItem(new Key());
    }
}
