package Locations;

import Inventory.Inventory;
import Inventory.Notebook;

public class FrenchPaintingCollections extends Location {

    public FrenchPaintingCollections() {
        super(
            "frenchPaintingCollections",
            new Inventory(),
            "You are surrounded by the painting of French artist, there seems no sign of Monalisa. " +
                "To your east, there is a corridor to go to the collections of other countries.",
            "On your left, there is a leather notebook lies quietly at your feet."
        );

    }

    @Override
    public String getDescription(){
        if(!isEmpty()){
            return "On your left, there is a leather notebook lies quietly at your feet.";}
        else{
            return "To your east, there is a corridor to go to the collections of other countries.";
        }
    }

}
