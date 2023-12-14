package Locations;

import Inventory.Inventory;
import Main.Staff;

public class ItalianPaintingCollections extends Location {
    public ItalianPaintingCollections() {
        super("italianPaintingCollections", null, "It is filled with paintings by Italian painters, Titian, Leonardo da Vinci, Caravaggio, but the important thing is that you need to find the location of the Mona Lisa.");

  }

    public String getDescription(){
        return "It is filled with paintings by Italian painters, Titian, Leonardo da Vinci, Caravaggio, but the important thing is that you need to find the location of the Mona Lisa.";
    }


}
