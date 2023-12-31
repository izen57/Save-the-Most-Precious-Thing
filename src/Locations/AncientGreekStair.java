package Locations;

import Inventory.Inventory;
import Inventory.MuseumMap;

public class AncientGreekStair extends Location {
    public AncientGreekStair() {
        super(
            "ancientGreekStair",
            new Inventory(),
            "You are standing before the headless Goddess of Victory, " +
                "with her wings outstretched on either side. " +
                "On her east is the Egypt Exhibition Hall," +
                "and on her west is the splendid Apollo Corridor. " +
                "Meanwhile, at her feet there seems to be a map left by someone else.",
            "There are only two exits here, one towards east and the other towards west."
        );

    }


    @Override
    public String getMessage(){
        if(isEmpty()){
        return "You are standing before the headless Goddess of Victory, " +
                "with her wings outstretched on either side. " +
                "On her east is the Egypt Exhibition Hall," +
                "and on her west is the splendid Apollo Corridor. ";}
        else{
           return "You are standing before the headless Goddess of Victory, " +
                   "with her wings outstretched on either side. " +
                   "On her east is the Egypt Exhibition Hall," +
                   "and on her west is the splendid Apollo Corridor. "+
                   "Meanwhile, at her feet there seems to be a map left by someone else.";
        }
    }
}
