package Main;

import Characters.NPC;
import Characters.User;
import Inventory.AbstractItem;
import Inventory.IApplicable;
import Locations.Location;

import static Main.Command.*;

/**
 * This class represents the main loop of the game.
 * which is mainly the process of dealing with the user input, parse them into command and
 * execute corresponding operations based on the command.
 */
public class MainLoop {

    /** The location of user */
    private Location currentLocation;

    /** The player of the game */
    private User user;

    /**
     * Construct a main loop with a specific start {@link Location} and a player {@link User}.
     * @param startLocation start location.
     * @param user player.
     */
    public MainLoop(Location startLocation, User user) {
        this.currentLocation = startLocation;
        this.user = user;
        this.user.setCurrentLocation(startLocation);
    }

    /**
     * Parse user input into command.
     * @param userInput
     * @return corresponding command of user input.
     */
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
            case "hi":
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
                return INVENTORY;

            case "help":
                return HELP;

            default:
                return UNKNOWN;
        }
    }

    /**
     * Execute corresponding operations based on the command.
     * @param command based on the user input.
     * @param userInput user input.
     */
    public void processCommand(Command command, String userInput) {
        //asked ChatGPT for this line.
        String[] words = userInput.trim().split("\\s+");
        switch (command) {
            case NORTH:
                if (user.getCurrentLocation().getNorth() != null) {
                    user.move("north");
                } else {
                    System.out.println("It seems like this is not the correct direction...");
                }
                break;

            case SOUTH:
                if (user.getCurrentLocation().getSouth() != null) {
                    user.move("south");
                } else {
                    System.out.println("It seems like this is not the correct direction...");
                }
                break;

            case EAST:
                if (user.getCurrentLocation().getEast() != null) {
                    user.move("east");
                } else {
                    System.out.println("It seems like this is not the correct direction...");
                }
                break;

            case WEST:
                if (user.getCurrentLocation().getWest() != null) {
                    user.move("west");
                } else {
                    System.out.println("It seems like this is not the correct direction...");
                }
                break;


            case TAKEITEM:
                AbstractItem itemToTake = user.getCurrentLocation().findItemByName(words[1]);
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
                AbstractItem locationItemToRead = user.getCurrentLocation().findItemByName(words[1]);
                if (userItemToRead != null) {
                    System.out.println(userItemToRead.getMessage());
                } else if (locationItemToRead != null) {
                    if(locationItemToRead instanceof IApplicable){
                        System.out.println(((IApplicable) locationItemToRead).getMessage());
                    }else{
                        System.out.println(locationItemToRead.getDescription());
                    }
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

                Location previousLocation = user.getCurrentLocation();
                currentLocation = user.showLastLocation();
                user.setCurrentLocation(currentLocation);
                System.out.println(currentLocation.getMessage());
                user.addLocation(previousLocation);

                TimeCounter.takeSteps();

                break;

            case INVENTORY:
                if (user.isInventoryEmpty())
                    System.out.println("Your inventory is empty.");
                else
                    user.showInventory();
                break;

            case LOOK:
                System.out.println(user.getCurrentLocation().getDescription());
                break;

            case ASK:
                System.out.println((user.getCurrentLocation().getCharacter()).getMessage());
                break;

            case HELP:
                System.out.println(
                    "The correct answer does not exceed two words, and is often a noun, a verb, or a combination of a verb and a noun. " +
                    "At the same time, pay attention to the items that appear in the scene. " +
                    "When you pick up the item, some items will enter your inventory and some will not. " +
                    "For item in inventory, you can drop it and the item will be removed from the inventory.");
                break;


            case UNKNOWN:
                System.out.println("This is not the correct command.");
                break;
        }
    }
}
