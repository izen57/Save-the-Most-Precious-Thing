package Main;

import Inventory.Inventory;
import Inventory.Key;
import Inventory.MuseumMap;
import Inventory.Newspaper;
import Locations.*;

import java.util.Scanner;

public class Game {
    User user = new User(new Inventory(), null);
    AncientGreekGallery ancientGreekGallery = new AncientGreekGallery();
    AncientGreekStair ancientGreekStair = new AncientGreekStair();
    ApolloGallery apolloGallery = new ApolloGallery();
    Corridor corridor = new Corridor();
    FrenchPaintingCollections frenchPaintingCollections = new FrenchPaintingCollections();
    ItalianPaintingCollections italianPaintingCollections = new ItalianPaintingCollections();
    SpanishPaintingCollections spanishPaintingCollections = new SpanishPaintingCollections();
//    TheGate theGate = new TheGate();
//    RoomOfMonalisa roomOfMonalisa = new RoomOfMonalisa();
    private static Scanner scanner = new Scanner(System.in);

    public void startGame(){
        System.out.println("Today is Monday, the closing day of the Louvre. The sun sets in the west, and the golden sunset shines on the huge glass pyramid in " +
                "front of the Louvre. Although you have seen this beautiful scene many times, the sunset still" +
                " makes you deeply addicted every time.  While you were immersed in the scenery, " +
                "you received a message on your phone...");



        while (true) { // Start an infinite loop
            //System.out.println("Enter 'yes' to get a congratulatory message, or anything else to try again:");
            String inputA = scanner.nextLine();

            if (inputA.contains("read")) { // Check if user input contains "read" (case insensitive)
                System.out.println("Someone has set a fire in the Mona Lisa's venue, and the fire is spreading." +
                        "Do not doubt and there is no time to doubt, you have been chosen, and your mission is to save the most precious thing."); // Print message
                System.out.println("Hit any key to continue");
                break; // Break the loop if the user entered "read"
            } else {
                System.out.println("While you were immersed in the scenery, you received a message on your phone..."); // Ask to re-enter if input is not "read"
                // The loop will continue, allowing the user to input again
            }
        }

        while (true) { // Start an infinite loop
            String inputB = scanner.nextLine(); // Read user input

            if (inputB != null) { // Check if user input contains "read" (case insensitive)
                System.out.println("the password for Louvre entry has been changed, if you want to know the password, read this carefully."); // Print message
                //this puzzle is generated by ChatGPT.
                System.out.println("I collected treasures from the past, but they were not mine; I showed the stories of the world, " +
                        "but never left my room. You can travel to ancient times with me, but I am always in the present. May I ask who I am?");
                break; // Break the loop if the user entered "read"
            }
        }

        while(true){
            String inputC = scanner.nextLine(); // Read user input

            if(inputC.equalsIgnoreCase("museum")){
                System.out.println("now you know the password to enter Louvre. and you immediately go to the entry of the museum, there are 3 wings in Louvre: Sully Denon and Richelieu. Remember, only if you enter the right room can you save the most precious good.");
                break;
            }else{
                System.out.println("I am right in front of your eyes, may I ask who I am?");
            }

        }

        while(true){
            String inputD = scanner.nextLine(); // Read user input

            if(inputD.toLowerCase().contains("denon")){
                user.setCurrentLocation(ancientGreekGallery);
                System.out.println(ancientGreekGallery.getMessage());
                break;
            }else{
                System.out.println("Remember, only if you enter the right room can you save the most precious thing in the world.");
            }

        }

        //enter the museum, the mean loop of the game begins
        user.setCurrentLocation(ancientGreekGallery);
        Scanner scanner = new Scanner(System.in);
        String currentLocation = "ancientGreekGallery";

        MAIN_LOOP:
        while (true) { // main loop
//            String currentLocation =String.valueOf(user.getLocation());
            MuseumMap map = user.findItemByName("map");
            switch (currentLocation){
                case "ancientGreekGallery":
                    String inputE = scanner.nextLine().toLowerCase();

                    if(inputE.contains("left")){
                        //set user's location to new location
                        user.setCurrentLocation(ancientGreekStair);
                        currentLocation = "ancientGreekStair";
                        user.addLocation(ancientGreekGallery);
                        System.out.println(ancientGreekStair.getMessage());

                    }else if(inputE.toLowerCase().contains("back")){
                        //the mission can not be denied, you can not go out of the Louvre now.
                        System.out.println("the mission can not be denied, you can not go out of the Louvre now.");

                    }else{
                        //print the direction is wrong, please try again
                        System.out.println("It seems like this is not the correct direction...");
                    }
                    break;

                case "ancientGreekStair":
                    //the user can pick up the map here
                    while (true) {
                        String inputF = scanner.nextLine().toLowerCase();

                        if (inputF.contains("right")) {
                            //set user's location to new location
                            user.setCurrentLocation(corridor);
                            user.addLocation(ancientGreekStair);
                            currentLocation = "corridor";
                            System.out.println(corridor.getMessage());
//                            currentLocation = user.moveForward(corridor, ancientGreekStair);
                            break;


                        } else if (inputF.contains("left")) {
                            user.setCurrentLocation(apolloGallery);
                            user.addLocation(ancientGreekStair);
                            currentLocation = "apolloGallery";
                            System.out.println(apolloGallery.getMessage());
                            break;


                        } else if (inputF.contains("pick") || inputF.contains("take")) {
                            //put the map into the user's inventory
                            map = user.getCurrentLocation().removeItem("map");
                            if (map != null) {
                                user.takeItem(map);
                                System.out.println(map.getMessage());
                            }
                        } else if (map != null && (inputF.contains("read") || inputF.contains("map"))) {
                            System.out.println(map.getMessage());
                        }
                        else if (inputF.contains("back") || inputF.contains("leave") || inputF.contains("return")) {
                            user.setCurrentLocation(user.showLastLocation());
                            System.out.println("You went back to the corridor filled with ancient Greek sculptures. " +
                                    "On your right is the statue of Venus with a broken arm. She is at the end of the corridor,facing the corridor and " +
                                            "quietly overlooking the countless worldly people passing by");
                            currentLocation = user.getCurrentLocation().getName();
                            user.removeLocation();
                            break;

                        } else {
                            //print the direction is wrong, please try again
                            System.out.println("It seems like this is not the correct direction...");
                        }
                    }
                    break;

                case "apolloGallery":

                    while(true) {

                        String inputG = scanner.nextLine().toLowerCase();

                        if (inputG.contains("right")) {
                            //set user's location to new location
                            user.setCurrentLocation(frenchPaintingCollections);
                            user.addLocation(apolloGallery);
                            currentLocation = "frenchPaintingCollections";
                            System.out.println(frenchPaintingCollections.getMessage());
                            break;


                        } else if (inputG.contains("back") || inputG.contains("leave") || inputG.contains("return")) {
//                            user.setCurrentLocation(user.showLastLocation());
//                            System.out.println(user.showLastLocation().getMessage());
//                            currentLocation = user.getCurrentLocation();
//                            user.removeLocation();
                            currentLocation = user.moveBack();
                            break;

                        } else if (map != null && (inputG.contains("read") || inputG.contains("map"))) {
                            System.out.println(map.getMessage());

                        }else {
                            //print the direction is wrong, please try again
                            System.out.println("It seems like this is not the correct direction...");
                        }
                    }
                    break;

                case "corridor":
              //      System.out.println(corridor.getMessage());
                    while (true) {
                        String inputH = scanner.nextLine().toLowerCase();

                        if (inputH.contains("right")) {
                            //set user's location to new location
                            user.setCurrentLocation(italianPaintingCollections);
                            user.addLocation(corridor);
                            currentLocation = "italianPaintingCollections";
                            System.out.println(italianPaintingCollections.getMessage());
                            break;

                        } else if (inputH.contains("left")) {
                            user.setCurrentLocation(frenchPaintingCollections);
                            user.addLocation(corridor);
                            currentLocation = "frenchPaintingCollections";
                            System.out.println(frenchPaintingCollections.getMessage());
                            break;

                        } else if (inputH.contains("middle")) {
                            user.setCurrentLocation(spanishPaintingCollections);
                            user.addLocation(corridor);
                            currentLocation = "spanishPaintingCollections";
                            System.out.println(spanishPaintingCollections.getMessage());
                            break;

                        } else if (inputH.contains("back") || inputH.contains("leave") || inputH.contains("return")) {
//                            System.out.println("There are people walking outside the corridor, you can't let people discover your whereabouts.");
//                            currentLocation = user.moveBack();
                            user.setCurrentLocation(user.showLastLocation());
                            System.out.println(user.showLastLocation().getMessage());
                            currentLocation = user.getCurrentLocation().getMessage();
                            user.removeLocation();
                            break;

                        } else if (map != null && (inputH.contains("read") || inputH.contains("map"))) {
                            System.out.println(map.getMessage());

                        }else {
                            //print the direction is wrong, please try again
                            System.out.println("It seems like this is not the correct direction...");
                        }
                    }
                    break;

                case "spanishPaintingCollections":
//                    System.out.println(spanishPaintingCollections.getMessage());
                    while (true) {
                        String inputI = scanner.nextLine().toLowerCase();

                        if (inputI.contains("back") || inputI.contains("leave") || inputI.contains("return")) {
                            user.setCurrentLocation(user.showLastLocation());
                            System.out.println(user.showLastLocation().getMessage());
                            currentLocation = user.getCurrentLocation().getName();
                            user.removeLocation();
                            break;
                        } else if (map != null && (inputI.contains("read") || inputI.contains("map"))) {
                            System.out.println(map.getMessage());
                        }else {
                            System.out.println("It seems like this is not the correct direction...");
                        }}
                        break;



                case "frenchPaintingCollections":
                    // Here the user will read the newspaper
                    while (true){
//                       System.out.println(frenchPaintingCollections.getMessage());
                            String inputJ = scanner.nextLine().toLowerCase();

                            if (inputJ.contains("back") || inputJ.contains("leave") || inputJ.contains("return")) {
                                user.setCurrentLocation(user.showLastLocation());
                                System.out.println(user.showLastLocation().getMessage());
                                currentLocation = user.getCurrentLocation().getName();
                                user.removeLocation();
                                break;


                            } else if (inputJ.contains("left")) {
                                user.setCurrentLocation(apolloGallery);
                                System.out.println(apolloGallery.getMessage());
                                currentLocation = "apolloGallery";
                                user.addLocation(frenchPaintingCollections);
                                break;

                            } else if (inputJ.contains("right")) {
                                user.setCurrentLocation(corridor);
                                System.out.println(corridor.getMessage());
                                currentLocation = "corridor";
                                user.addLocation(frenchPaintingCollections);
                                System.out.println("In the corner of the hall you see a rack with booklets about the history of the hall.\n");
                                Newspaper newspaper = user.getCurrentLocation().findItemByName("newspaper");
                                System.out.println(newspaper.getDescription());
                                break;
                            } else if (map != null && (inputJ.contains("read") || inputJ.contains("map"))) {
                                System.out.println(map.getMessage());

                            }else {
                                System.out.println("It seems like this is not the correct direction...");
                            }
                    }
                    break;




                case "italianPaintingCollections":
                    while (true) {
                        //where the user should use the item Map to go to the room where Monalisa is stored
                        String inputL = scanner.nextLine().toLowerCase();

                        if (inputL.contains("back") || inputL.contains("leave") || inputL.contains("return")) {
                            user.setCurrentLocation(user.showLastLocation());
                            System.out.println(user.showLastLocation().getMessage());
                            currentLocation = user.getCurrentLocation().getName();
                            user.removeLocation();
                            break;

                        } else if (map != null && (inputL.contains("read") || inputL.contains("map"))) {
                            System.out.println(map.getMessage());
                        } else if (inputL.contains("madonna")) {
//                            currentLocation = "the Gate";
                            System.out.println("you quickly found Our Lady of the Rocks. Opposite was an independent room, " +
                                    "and the door of the house was closed. At the same time, " +
                                    "a staff member in the museum was lowering her head to organize something.");
                            break MAIN_LOOP;
                        } else {
                            System.out.println("It seems like this is not the correct direction...");
                        }
                    }
                        break;

                default:
                    System.out.println("You are lost.");
                    return;

            }
        }



//        //interact with the NPC
          // if user choose to talk to staff
//        // the user will get another message said:
//        //"Do you need any help? The museum curator turns her head and asked you"
//        // if user said yes: she will notice you are a stranger and game over
//        //if user answer no: she will ask you for help in reverse and lend u the key to open the gate of room which keeps the monalisa
        while(true){
            String inputM = scanner.nextLine().toLowerCase();
            if(inputM.contains("talk") ||inputM.contains("ask") ){
                System.out.println("Do you need any help? the staff raised her head and asked you nicely.");
                break;
            }else {
                    System.out.println("You can't do anything strange, otherwise she will notice you and the rescue mission will fail.");
                }
        }

        while(true){
            String inputN = scanner.nextLine().toLowerCase();
            if(inputN.contains("yes")){
                System.out.println("Hey, I don't know you, you're not a museum member here, you need to leave immediately or I'll call the police.");
                System.out.println("game over. you failed the mission :(");
                return;
            } else if (inputN.contains("no")) {
                System.out.println("Okay, can you do me a favor? I'm going to get something from the basement. This is the key to Monalisa's room. Can you help me move this thing in?");
                System.out.println("you take the key from her, now it seems like you can open the door now. Meanwhile, there are some small words on the key.");
                user.takeItem(user.getCurrentLocation().removeItem("key"));
               break;
            }else{
                System.out.println("You can't do anything strange, otherwise she will notice you and the rescue mission will fail.");
            }
        }


        while(true){
            String inputO = scanner.nextLine().toLowerCase();
            Key key = user.findItemByName("key");
            if (key != null && (inputO.contains("read") || inputO.contains("look") ||inputO.contains("key"))) {
                System.out.println(key.getMessage());
            } else if (inputO.contains("open")) {
                System.out.println("you entered the room, Monalisa is right in front of you, and the rescue mission seems to be completed. However suddenly, to your right, in the completely opposite direction to the Mona Lisa, you hear the faint cry of the kitten.");
                System.out.println();
                System.out.println("At the moment, the flames have blackened the frame of the Mona Lisa, " +
                    "and the painting inside also shows signs of being ignited. " +
                        "Between the dying kitten and the Mona Lisa that is about to be swallowed up by the flames, you can only make the only decision...");
                break;
            }else{
                System.out.println("The Mona Lisa is in danger, doing this will only waste your time.");
            }

        }


        while(true){
            String inputP = scanner.nextLine().toLowerCase();
            if(inputP.contains("monalisa") || inputP.contains("left")){
                System.out.println("Congratulations on successfully rescuing the Mona Lisa! However, the real Mona Lisa is intact in the museum's storage room, and what you rescued is just a replica. At the same time, the kitten died in pain.");
                System.out.println("Game Over. Thanks for playing.");
           return;
            } else if (inputP.contains("cat") || inputP.contains("kitten") || inputP.contains("right") ) {
                System.out.println("you saved the cat, and it turns out this extremely cute and lucky cat belongs to a very wealthy woman and you are rewarded with five million euros.");
                System.out.println("Game Over. Thanks for playing ;)");
            return;
            }

        }


        //scanner.close(); // Close the scanner
    }



    public static void main(String[] args) {
        new Game().startGame();

    }
}


