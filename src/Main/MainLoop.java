package Main;

import Characters.NPC;
import Characters.User;
import Inventory.AbstractItem;
import Inventory.IApplicable;
import Locations.Location;

import static Main.Command.*;


public class MainLoop {
    private Location currentLocation;
    private User user;

    public MainLoop(Location startLocation, User user) {
        this.currentLocation = startLocation;
        this.user = user;
        this.user.setCurrentLocation(startLocation);
    }

    public Command parseCommand(String userInput) {
        switch (userInput.trim().toLowerCase()) {
            case "east":
            case "go east":
            case "move east":
                return EAST;

            case "west":
            case "go west":
            case "move west":
                return WEST;

            case "north":
            case "go north":
            case "move north":
                return NORTH;

            case "south":
            case "go south":
            case "move south":
                return SOUTH;

            case "look":
            case "look around":
            case "observe":
            case "explore":
                return LOOK;

            case "ask":
            case "ask them":
            case "talk":
                return ASK;

            case "read":
                return READ;

            case "drop":
                return DROP;

            case "take":
                return TAKE;

            case "take map":
            case "pick map":
            case "take notebook":
            case "pick notebook":
            case "pick newspaper":
            case "take newspaper":
                return TAKEITEM;

            case "drop map":
            case "throw map":
            case "drop notebook":
            case "throw notebook":
            case "drop newspaper":
            case "throw newspaper":
                return DROPITEM;


            case "read map":
            case "read notebook":
            case "read newspaper":
            case "look newspaper":
                return READITEM;

            case "go back":
            case "back":
            case "move back":
                return BACK;

            case "inventory":
            case "check inventory":
                return Inventory;

            case "help":
                return HELP;

            default:
                return Command.UNKNOWN;
        }
    }

    public void processCommand(Command command, String userInput) {
        //asked ChatGPT for this line.
        String[] words = userInput.trim().split("\\s+");
        switch (command) {
            case NORTH:
                if (currentLocation.getNorth() != null) {
                    user.addLocation(currentLocation);
                    currentLocation = currentLocation.getNorth();
                    System.out.println(currentLocation.getMessage());
                    user.setCurrentLocation(currentLocation);
                } else {
                    System.out.println("It seems like this is not the correct direction...");
                }
                break;

            case SOUTH:
                if (currentLocation.getSouth() != null) {
                    user.addLocation(currentLocation);
                    currentLocation = currentLocation.getSouth();
                    System.out.println(currentLocation.getMessage());
                    user.setCurrentLocation(currentLocation);
                } else {
                    System.out.println("It seems like this is not the correct direction...");
                }
                break;

            case EAST:
                if (currentLocation.getEast() != null) {
                    user.addLocation(currentLocation);
                    currentLocation = currentLocation.getEast();
                    System.out.println(currentLocation.getMessage());
                    user.setCurrentLocation(currentLocation);
                } else {
                    System.out.println("It seems like this is not the correct direction...");
                }
                break;

            case WEST:
                if (currentLocation.getWest() != null) {
                    user.addLocation(currentLocation);
                    currentLocation = currentLocation.getWest();
                    System.out.println(currentLocation.getMessage());
                    user.setCurrentLocation(currentLocation);
                } else {
                    System.out.println("It seems like this is not the correct direction...");
                }
                break;



            case TAKEITEM:
                AbstractItem itemToTake = currentLocation.findItemByName(words[1]);
                if (itemToTake instanceof IApplicable) {
                    user.takeItem(itemToTake);
                } else if (itemToTake != null) {
                    System.out.println("The " + itemToTake.getName() + " is the museum property " +
                        "and can not be added to your inventory." +
                        "However, you can still read it."
                    );
                } else {
                    System.out.println("There's nothing to take here.");
                }
                break;


            case DROPITEM:
                if (user.findItemByName(words[1]) != null) {
                    user.dropItem(words[1]);
                } else {
                    System.out.println("The "+ words[1] + " is not in your inventory.");
                }
                break;

            case READITEM:
                IApplicable userItemToRead = user.findItemByName(words[1]);
                IApplicable locationItemToRead = currentLocation.findItemByName(words[1]);
                if (userItemToRead != null) {
//                    IApplicable itemToRead = user.findItemByName(words[1]);
                    System.out.println(userItemToRead.getMessage());
                } else if (locationItemToRead != null) {
//                    AbstractItem itemToRead = currentLocation.findItemByName(words[1]);
//                    if(itemToRead instanceof IApplicable){
//                        System.out.println("You need to take something can be read first.");
//                    }else{
                        System.out.println(locationItemToRead.getMessage());
//                    }
                } else {
                    System.out.println("There is no " + words[1] + " to be read here.");
                }
                break;

            case READ:
                System.out.println("Please specify what you would like to read.");
                break;

            case DROP:
                System.out.println("Please specify what you would like to drop.");
                break;

            case TAKE:
                System.out.println("Please specify what you would like to take.");
                break;

            case BACK:
                if (user.getLocationHistory() == null) {
                    System.out.println("The mission can not be denied, you can not go out of the Louvre now.");
                    break;
                }

                Location previousLocation = currentLocation;
                currentLocation = user.showLastLocation();
                user.setCurrentLocation(currentLocation);
                System.out.println(currentLocation.getMessage());
                user.addLocation(previousLocation);

                break;

            case Inventory:
                if (user.isInventoryEmpty())
                    System.out.println("Your inventory is empty.");
                else
                    user.showInventory();
                break;

            case LOOK:
                System.out.println(currentLocation.getDescription());
                break;

            case ASK:
                if (user.getCurrentLocation().getCharacter() instanceof NPC) {
                    System.out.println(((NPC) user.getCurrentLocation().getCharacter()).getMessage());
                }
                break;

            case HELP:
                System.out.println(
                    "The correct answer does not exceed two words, and is often a noun, a verb, or a combination of a verb and a noun. " +
                    "At the same time, pay attention to the items that appear in the scene. " +
                    "When you pick up the item, some items will enter your inventory and some will not. " +
                    "For item in inventory, you can drop it and the item will be removed from the inventory.");
                break;


            default:
                System.out.println("This is not the correct command.");
                break;
        }
    }
}
