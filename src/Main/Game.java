package Main;

import Inventory.Inventory;
import Inventory.Key;
import Locations.*;

import java.util.Scanner;

public class Game {


    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        User user = new User(new Inventory(), null);
        Staff staff = new Staff(new Inventory(), null);
        staff.inventory.addItem(new Key());


        // create locations
        AncientGreekGallery ancientGreekGallery = new AncientGreekGallery();
        AncientGreekStair ancientGreekStair = new AncientGreekStair();
        ApolloGallery apolloGallery = new ApolloGallery();
        Corridor corridor = new Corridor();
        FrenchPaintingCollections frenchPaintingCollections = new FrenchPaintingCollections();
        ItalianPaintingCollections italianPaintingCollections = new ItalianPaintingCollections();
        AncientEgyptPavilion ancientEgyptPavilion = new AncientEgyptPavilion();
        Restaurant restaurant = new Restaurant();
        SpanishPaintingCollections spanishPaintingCollections = new SpanishPaintingCollections();

        // set the connections between different locations
        ancientGreekGallery.setNorth(ancientGreekStair);
        ancientGreekStair.setSouth(ancientGreekGallery);

        ancientGreekStair.setNorth(apolloGallery);
        ancientGreekStair.setEast(ancientEgyptPavilion);
        ancientGreekStair.setWest(apolloGallery);

        apolloGallery.setNorth(frenchPaintingCollections);
        apolloGallery.setEast(corridor);

        frenchPaintingCollections.setEast(spanishPaintingCollections);
        frenchPaintingCollections.setSouth(apolloGallery);

        spanishPaintingCollections.setWest(frenchPaintingCollections);
        spanishPaintingCollections.setEast(italianPaintingCollections);

        corridor.setNorth(spanishPaintingCollections);
        corridor.setEast(restaurant);
        corridor.setWest(apolloGallery);

        restaurant.setWest(corridor);

        italianPaintingCollections.setWest(spanishPaintingCollections);

        ancientEgyptPavilion.setNorth(corridor);
        ancientEgyptPavilion.setWest(ancientGreekStair);

        System.out.println("Save the Most Precious Thing\n" +
                "Text Adventure Game\n" +
                "Copyright 2023-12 by Yajing Wang & Mikhail Korotych.\n" +
                "(First-time players should type “about”.)\n"+
                "(If you are ready for an interesting adventure, please type “ready”.) ");

        while(true){
            System.out.print("> ");
            String input0 = scanner.nextLine().toLowerCase();

            if(input0.equalsIgnoreCase("ready")){
                System.out.println(
                        "It is Monday, the closing day of the Louvre. " +
                        "The sun is setting in the west and the golden sunset is shining on the huge glass pyramid in front of the Louvre. " +
                        "Although you have seen this beautiful scene many times before, the sunset still makes you deeply addicted every time. " +
                        "While you were immersed in the scenery, you received a message on your phone..."
                );

                break;
            } else if (input0.equalsIgnoreCase("about")) {
                System.out.println("This is a text adventure game set in the Louvre Museum in Paris, France. You need to enter the correct answer to advance the plot or location. The correct answer does not exceed two words, and is often a noun, a verb, or a combination of a verb and a noun.\n" +
                        "At the same time, pay attention to the items that appear in the scene. When you pick up the item, the item will automatically enter your inventory. When you throw the item away, the item will be removed from the inventory.\n" +
                        "\n" +
                        "Hope you enjoy our game (^^)");
            }else{
                System.out.println("What are you waiting for? A magical adventure is right in front of you.");
            }

        }






        while (true) { // Start an infinite loop
            //System.out.println("Enter 'yes' to get a congratulatory message, or anything else to try again:");
            System.out.print("> ");
            String inputA = scanner.nextLine().toLowerCase();

            if (inputA.contains("read")) { // Check if user input contains "read" (case insensitive)
                System.out.println(
                    "Someone has set fire to the Mona Lisa and the fire is spreading, " +
                    "do not doubt and there is no time to doubt, you have been chosen, and your mission is to save the most precious thing."
                ); // Print message
                System.out.println("Hit any key to continue...");
                break; // Break the loop if the user entered "read"
            } else {
                System.out.println("While you were immersed in the scenery, you received a message on your phone..."); // Ask to re-enter if input is not "read"
                // The loop will continue, allowing the user to input again
            }
        }

        while (true) { // Start an infinite loop
            String inputB = scanner.nextLine().toLowerCase(); // Read user input

            if (inputB != null) { // Check if user input contains "read" (case insensitive)
                System.out.println(
                    "The password for entering the Louvre has been changed." +
                    "If you want to know the password, read this carefully!"
                ); // Print message
                //this puzzle is generated by ChatGPT.
                System.out.println(
                    "\n\"I collected treasures from the past, but they were not mine. " +
                    "I show the stories of the world, but I have never left my room. " +
                    "You can travel with me to ancient times, " +
                    "but I am always in the present. Who I am?\"");
                break; // Break the loop if the user entered "read"
            }
        }

        while (true) {
            System.out.print("> ");
            String inputC = scanner.nextLine(); // Read user input

            if (inputC.equalsIgnoreCase("museum")) {
                System.out.println(
                    "Now you know the password to enter Louvre and go immediately to the entrance of the museum. " +
                    "There are 3 wings in Louvre: Sully Denon and Richelieu. " +
                    "Remember, only if you enter the right room you can save the most precious good."
                );
                break;
            } else {
                System.out.println("I am right in front of your eyes. Who I am?");
            }
        }

        while (true) {
            System.out.print("> ");
            String inputD = scanner.nextLine().toLowerCase(); // Read user input

            if (inputD.contains("denon")) {
                user.setCurrentLocation(ancientGreekGallery);
                System.out.println(ancientGreekGallery.getMessage());
                break;
            } else {
                System.out.println("Remember, only if you enter the right room you can save the most precious good.");
            }
        }

        MainLoop MainLoop = new MainLoop(ancientGreekGallery, user);

        while (true) {
            try{
            System.out.print("> ");
            String input = scanner.nextLine().toLowerCase();
            if (input.contains("madonna")) {
                break;
            }
            //asked ChatGPT for this detection
            if (input.matches(".*\\d+.*")) {
                    throw new IllegalArgumentException("in this game, all correct answers consist of only words, entering numbers does not help.");
            }

            Command command = MainLoop.parseCommand(input);
            MainLoop.processCommand(command, input);}
            catch (IllegalArgumentException e){
                System.out.println("please note: " + e.getMessage());
            }
            catch (Exception e){
                System.out.println("An error occurred: " + e.getMessage());
            }

        }

        System.out.println(
            "You quickly found Our Lady of the Rocks. " +
            "Opposite was an independent room, " +
            "and the door of the house was closed. " +
            "At the same time, an employee of the museum " +
            "was lowering her head to organize something."
        );


        while (true) {
            System.out.print("> ");
            String inputM = scanner.nextLine().toLowerCase();
            if (inputM.contains("talk") || inputM.contains("ask")) {
                System.out.println("\"Do you need some help?\" The employee raised her head and asked you nicely.");
                break;
            } else {
                System.out.println("It is better not to do anything weird or she'll notice you and the rescue mission will fail.");
            }
        }

        while (true) {
            System.out.print("> ");
            String inputN = scanner.nextLine().toLowerCase();
            if (inputN.contains("yes")) {
                System.out.println("Hey, I don't know you, you're not a museum member here, you need to leave immediately or I'll call the police.");
                System.out.println("Game over. You have failed the mission :(");
                return;
            } else if (inputN.contains("no")) {
                System.out.println(
                    "Okay, can you do me a favor? " +
                    "I'm going to get something from the basement. " +
                    "This is the key to Monalisa's room. " +
                    "Can you help me move this thing in?"
                );
                System.out.println(
                    "You take the key from her, now it seems like you can open the door. " +
                    "Meanwhile, there are some little words on the key."
                );
                Key key = staff.inventory.findItemByName("key");
                user.inventory.addItem(key);
                staff.inventory.removeItem("key");
                break;
            } else {
                System.out.println("It is better not to do anything weird or she'll notice you and the rescue mission will fail.");
            }
        }

        while (true) {
            System.out.print("> ");
            String inputO = scanner.nextLine().toLowerCase();
            Key key = user.findItemByName("key");
            if (key != null && (inputO.contains("read") || inputO.contains("look") || inputO.contains("key"))) {
                System.out.println(key.getMessage());
            } else if (inputO.contains("open")) {
                System.out.println(
                    "You have entered the room, Monalisa is right in front of you, and the rescue mission seems to be over. " +
                    "But suddenly, to your right, in the completely opposite direction of the Mona Lisa, " +
                    "you hear the faint cry of the kitten.\n"
                );
                System.out.println(
                    "At the moment, the flames have blackened the frame of the Mona Lisa,  " +
                    "and the painting inside also shows signs of having been set on fire.  " +
                    "Between the dying kitten and the Mona Lisa that is about to be consumed up by the flames, you can only make one choice..."
                );
                break;
            } else {
                System.out.println("The Mona Lisa is in danger, you are wasting your time.");
            }
        }

        while (true) {
            System.out.print("> ");
            String inputP = scanner.nextLine().toLowerCase();
            if (inputP.contains("monalisa") || inputP.contains("left")) {
                System.out.println(
                    "Congratulations on your successful rescue of the Mona Lisa! " +
                    "However, the real Mona Lisa is intact in the museum's storeroom, and what you rescued is only a replica. " +
                    "At the same time, the kitten died in agony..........\n\n"
                );
                System.out.println("Game over. Thanks for playing.");
                return;
            } else if (inputP.contains("cat") || inputP.contains("kitten") || inputP.contains("right")) {
                System.out.println(
                    "You saved the cat, and it turns out that this extremely cute and happy cat " +
                    "belongs to a very wealthy woman, and you are rewarded with five million euros.\n\n"
                );
                System.out.println("Game over. Thanks for playing ;)");

                System.out.println("\n\n" +
                    "                 _                       \n" +
                    "                \\`*-.                   \n" +
                    "                 )  _`-.                \n" +
                    "                .  : `. .               \n" +
                    "                : _   '  \\              \n" +
                    "                ; *` _.   `*-._         \n" +
                    "                `-.-'          `-.      \n" +
                    "                  ;       `       `.    \n" +
                    "                  :.       .        \\   \n" +
                    "                  . \\  .   :   .-'   .  \n" +
                    "                  '  `+.;  ;  '      :  \n" +
                    "                  :  '  |    ;       ;-.\n" +
                    "                  ; '   : :`-:     _.`* ;\n" +
                    "         [bug] .*' /  .*' ; .*`- +'  `*'\n" +
                    "               `*-*   `*-*  `*-*'       \n"
                );

                return;
            }
        }
    }


    public static void main(String[] args) {
        new Game().startGame();
    }
}


