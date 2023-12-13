package Main;

import Inventory.MuseumMap;
import Inventory.Newspaper;
import Locations.Location;

import static Main.Command.*;

public class MainLoop {
    private Location currentLocation;
    private User user;
    private Newspaper newspaper = new Newspaper();

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
                return Command.WEST;

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
                return Command.LOOK;

            case "jump":
                return Command.JUMP;

            case "sleep":
                return Command.SLEEP;

            case "run":
                return Command.RUN;

            case "tip":
                return Command.TIP;

            case "take the map":
            case "pick the map":
            case "pick map":
            case "take map":
            case "map":
                return Command.TAKE;

            case "drop the map":
            case "throw the map":
            case "drop map":
            case "throw map":
                return Command.DROP;

            case "read the map":
            case "look the map":
            case "read map":
            case "look map":
                return Command.READ;

            case "go back":
            case "back":
            case "move back":
                return Command.BACK;

            case "read newspaper":
            case "look newspaper":
            case "pick newspaper":
            case "take newspaper":
                return Command.NEWSPAPER;



            case "quit":
            case "give up":
                return Command.QUIT;
            default:
                return Command.UNKNOWN;
        }
    }

    public void processCommand(Command command) {
        switch (command) {
            case NORTH:
                if (currentLocation.getNorth() != null) {
                    user.addLocation(currentLocation);
                    currentLocation = currentLocation.getNorth();
                    System.out.println(currentLocation.getMessage());
                    user.setCurrentLocation(currentLocation);
//                    user.move(currentLocation,NORTH);

                } else {
                    System.out.println("It seems that this is not the right direction...");
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
                    System.out.println("It seems that this is not the right direction...");
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
                    System.out.println("It seems that this is not the right direction...");
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
                    System.out.println("It seems that this is not the right direction...");
                }
                break;

            case TAKE:
                if(currentLocation.findItemByName("map") != null){
                    MuseumMap map = currentLocation.findItemByName("map") ;
//                    user.inventory.addItem(map);
                    user.takeItem(map);
                    System.out.println(map.getMessage());
                }else{
                    System.out.println("There's nothing to take here.");
                }
                break;

            case DROP:
                if (user.findItemByName("map") != null) {
                    MuseumMap map = user.inventory.findItemByName("map");
                    user.dropItem("map");
//                    user.inventory.removeItem("map");
//                    currentLocation.addItem(map);
                    System.out.println("You have dropped your map.");
                } else {
                    System.out.println("You have no map.");
                }
                break;

            case READ:
                if (user.findItemByName("map") != null) {
                    System.out.println(user.findItemByName("map").getDescription());
                }
                break;

            case BACK:
                if (user.getLocationHistory() != null) {
                    Location previousLocation = currentLocation;
                    currentLocation = user.showLastLocation();
                    user.setCurrentLocation(currentLocation);
                    System.out.println(currentLocation.getMessage());
                    user.addLocation(previousLocation);
                } else {
                    System.out.println("The mission cannot be denied, you cannot leave the Louvre now.");
                }
                break;

            //case look
            case LOOK:
                System.out.println(currentLocation.getMessage());
                break;

            //case jump
            case JUMP:
                System.out.println("Mona Lisa is in danger, jumping won't help you.");
                break;

            case NEWSPAPER:
                if(user.getCurrentLocation().getName().equals("corridor"))
                    System.out.println(newspaper.getDescription());
                break;

            case TIP:
                if(user.getCurrentLocation().getName().equals("restaurant"))
                    System.out.println("Surprise! some recommendation from Mikhail & Yajing: ");
                break;

            default:
                System.out.println("This is not a useful command.");
                break;
        }
    }
}

