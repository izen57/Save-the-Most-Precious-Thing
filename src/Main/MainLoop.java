package Main;

import Inventory.AbstractItem;
import Inventory.IApplicable;
import Inventory.Newspaper;
import Locations.*;

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

            case "jump":
                return JUMP;

            case "sleep":
                return SLEEP;

            case "run":
                return RUN;

            case "tip":
                return TIP;

            case "take map":
            case "pick map":
            case "take notebook":
            case "pick notebook":
                return TAKE;

            case "drop map":
            case "throw map":
            case "drop notebook":
            case "throw notebook":
                return DROP;

            case "read map":
            case "read notebook":
                return READ;

            case "go back":
            case "back":
            case "move back":
                return BACK;

            case "read newspaper":
            case "look newspaper":
            case "pick newspaper":
            case "take newspaper":
                return NEWSPAPER;

            case "inventory":
            case "check inventory":
                return Inventory;

            case "help":
                return HELP;



            case "quit":
            case "give up":
                return Command.QUIT;
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
//                    user.move(currentLocation,NORTH);

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
//                    user.move(currentLocation,SOUTH);
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
//                    user.move(currentLocation, EAST);
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
//                    user.move(currentLocation, WEST);
                } else {
                    System.out.println("It seems like this is not the correct direction...");
                }
                break;


            case TAKE:
                IApplicable itemToTake = currentLocation.findItemByName(words[1]) ;
                if(itemToTake != null){
                user.takeItem((AbstractItem) itemToTake);}
                else{System.out.println("There's nothing to take here.");}
                break;


            case DROP:
                if( user.findItemByName(words[1])!=null){
                    user.dropItem(words[1]);
                }else{
                    System.out.println("Your backpack is empty, there is nothing to drop.");
                }
                break;

            case READ:
                if(user.findItemByName(words[1]) != null){
                    IApplicable itemToRead = user.findItemByName(words[1]);
                    System.out.println(itemToRead.getMessage());
                }
                break;

            case BACK:
                if(user.getLocationHistory()!= null){
                    Location previousLocation = currentLocation;
                    currentLocation = user.showLastLocation();
                    user.setCurrentLocation(currentLocation);
                    System.out.println(currentLocation.getMessage());
                    user.addLocation(previousLocation);

                }else{
                    System.out.println("The mission can not be denied, you can not go out of the Louvre now.");
                }
                break;

            case Inventory:
                if(user.getInventory() != null){
                    System.out.print("Now you have ");
                    for(int i = 0; i<user.getInventory().getStorage().size(); i++){
                        System.out.print(user.getInventory().getStorage().get(i).getName() + " ");
                    }
                    System.out.print(" in your inventory.\n")
                    ;
                }
                break;

            //case look
            case LOOK:
                System.out.println(currentLocation.getDescription());
                break;

            //case jump
            case JUMP:
                System.out.println("Mona Lisa is in danger, jumping won't help you.");
                break;


            case NEWSPAPER:
                if(user.getCurrentLocation().getName().equals("corridor"))
                {
                Newspaper newspaper = user.getCurrentLocation().findItemByName("newspaper");
                System.out.println(newspaper.getDescription());
                }
                break;

            case TIP:
                if(user.getCurrentLocation().getName().equals("restaurant"))
                {
                    System.out.println("Surprise! some recommendation from Mikhail & Yajing:  ");
                }
                break;

            case HELP:
                System.out.println(" The correct answer does not exceed two words, and is often a noun, a verb, or a combination of a verb and a noun" +
                        "At the same time, pay attention to the items that appear in the scene. When you pick up the item, the item will automatically enter your inventory. When you throw the item away, the item will be removed from the inventory.");






            default:
                System.out.println("This is not the correct command.");
                break;
        }
    }



    }






