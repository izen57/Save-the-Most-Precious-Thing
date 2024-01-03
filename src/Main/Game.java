package Main;

import Inventory.*;
import Locations.*;
import Characters.*;

import java.util.Objects;
import java.util.Scanner;

public class Game {
    private User user;
    private Friend friend;
    private Location startLocation;

    public void initializeElements() {
        this.user = new User(new Inventory(), null);
        this.friend = new Friend(null, null);


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

        //put NPC and items into locations
        this.startLocation = ancientGreekGallery;
        this.friend.setCurrentLocation(restaurant);
        restaurant.placeCharacter(friend);
        ancientGreekStair.addItem(new MuseumMap());
        frenchPaintingCollections.addItem(new Notebook());

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
    }


    public void startGame() {
        this.initializeElements();
        Scanner scanner = new Scanner(System.in);

        System.out.println(
            "Save the Most Precious Thing\n" +
            "Text Adventure Game\n" +
            "Copyright 2023-12 by Yajing Wang & Mikhail Korotych.\n" +
            "(First-time players should type “about”.)\n"+
            "(If you are ready for an interesting adventure, please type “ready”.)"
        );

        while(true) {
            System.out.print("> ");
            String input0 = scanner.nextLine().toLowerCase();

            if (input0.equalsIgnoreCase("ready")) {
                System.out.println(
                    "It is Monday, the closing day of the Louvre. " +
                    "The sun is setting in the west and the golden sunset is shining on the huge glass pyramid in front of the Louvre. " +
                    "Although you have seen this beautiful scene many times before, the sunset still makes you deeply addicted every time. " +
                    "While you were immersed in the scenery, you received a message on your phone..."
                );

                break;
            } else if (input0.equalsIgnoreCase("about")) {
                System.out.println(
                    "This is a text adventure game set in the Louvre Museum in Paris, France. " +
                    "You need to enter the correct answer to advance the plot or location. " +
                    "The correct answer does not exceed two words, and is often a noun, a verb, or a combination of a verb and a noun.\n" +
                    "At the same time, pay attention to the items that appear in the scene. " +
                    "When you pick up the item, some items will enter your inventory and some will not. " +
                    "For item in inventory, you can drop it and the item will be removed from the inventory.\n" +
                    "\n" +
                    "Hope you enjoy our game (^^)"
                );
            } else {
                System.out.println("What are you waiting for? A magical adventure is right in front of you.");
            }
        }


        while (true) { // Start an  loop
            System.out.print("> ");
            String inputA = scanner.nextLine().toLowerCase();

            if (inputA.contains("read")) { // Check if user input contains "read" (case insensitive)
                System.out.println(
                    "Someone has set fire to the Mona Lisa and the fire is spreading, " +
                    "do not doubt and there is no time to doubt, you have been chosen, " +
                    "and your mission is to save the most precious thing."
                ); // Print message
                System.out.println("Hit any key to continue...");
                break;
            } else if (inputA.contains("quit") || inputA.contains("give up")) {
                System.out.println("You've exited from the game. Game over.");
                return;
            } else {
                System.out.println("While you were immersed in the scenery, you received a message on your phone..."); // Ask to re-enter if input is not "read"
                // The loop will continue, allowing the user to input again
            }
        }

        while (true) { // Start an infinite loop
            String inputB = scanner.nextLine().toLowerCase(); // Read user input

            if (inputB != null) {
                System.out.println(
                    "The password for entering the Louvre has been changed. " +
                    "If you want to know the password, read this carefully:"
                ); // Print message
                //this puzzle is generated by ChatGPT.
                System.out.println(
                    "I collected treasures from the past, but they were not mine. " +
                    "I show the stories of the world, but I have never left my room. " +
                    "You can travel with me to ancient times, " +
                    "but I am always in the present. Who I am?\""
                );
                break;
            }
        }

        while (true) {
            System.out.print("> ");
            String inputC = scanner.nextLine(); // Read user input

            if (inputC.equalsIgnoreCase("museum")) {
                System.out.println(
                    "Now you know the password to enter Louvre and go immediately to the entrance of the museum. " +
                    "Since you'll enter there the time will run out. Nevertheless, pay your attention to details as they may be crucial in your mission! " +
                    "There are 3 wings in Louvre: Sully Denon and Richelieu. " +
                    "Remember, only if you enter the right room you can save the most precious good."
                );
                break;
            } else if (inputC.contains("quit") || inputC.contains("give up")) {
                System.out.println("You've exited from the game. Game over.");
                return;
            } else {
                System.out.println("I am right in front of your eyes. Who I am?");
            }
        }

        while (true) {
            System.out.print("> ");
            String inputD = scanner.nextLine().toLowerCase(); // Read user input

            if (inputD.contains("denon")) {
                user.setCurrentLocation(startLocation);
                System.out.println(startLocation.getMessage());
                break;
            } else if (inputD.contains("quit") || inputD.contains("give up")) {
                System.out.println("You've exited from the game. Game over.");
                return;
            } else {
                System.out.println("Remember, only if you enter the right room you can save the most precious good.");
            }
        }

        MainLoop MainLoop = new MainLoop(startLocation, user);
        boolean running = true;
        boolean quit = false;

        do {
            try {
                System.out.print("> ");
                String input = scanner.nextLine().toLowerCase();
                if (Objects.equals(user.getCurrentLocation().getName(), "italianPaintingCollections") && input.contains("madonna") && (input.contains("go") || input.contains("move"))) {
                    running = false;
                } else if (input.contains("quit") || input.contains("give up")) {
                    running = false;
                    quit = true;
                }
                //asked ChatGPT for this detection
                else if (input.matches(".*\\d+.*")) {
                    throw new IllegalArgumentException("All correct answers in this game are made up of words. Entering numbers will not be helpful.");
                } else {
                    Command command = MainLoop.parseCommand(input);
                    MainLoop.processCommand(command, input);
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Please note: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }

        } while(running);

        if (quit) {
            System.out.println("You've exited from the game. Game over.");
            return;
        }

        System.out.println(
            "You quickly found Our Lady of the Rocks. Opposite was an independent room, " +
            "and the door of the house was closed. At the same time, an employee of the museum " +
            "was lowering her head to organize something."
        );

        while (true) {
            System.out.print("> ");
            String inputM = scanner.nextLine().toLowerCase();
            if (inputM.contains("talk") || inputM.contains("ask")) {
                System.out.println("\"Do you need some help?\", The employee raised her head and asked you nicely.");
                break;
            } else if (inputM.contains("quit") || inputM.contains("give up")) {
                System.out.println("You've exited from the game. Game over.");
                return;
            } else {
                System.out.println(
                    "It is better not to do anything weird " +
                    "or she'll notice you and the rescue mission will fail."
                );
            }
        }

        while (true) {
            System.out.print("> ");
            String inputN = scanner.nextLine().toLowerCase();
            if (inputN.contains("yes")) {
                System.out.println(
                    "Hey, I don't know you, you're not a museum member here, " +
                    "you need to leave immediately or I'll call the police."
                );
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
                break;
            } else if (inputN.contains("quit") || inputN.contains("give up")) {
                System.out.println("You've exited from the game. Game over.");
                return;
            } else {
                System.out.println(
                    "It is better not to do anything weird or she'll notice you " +
                    "and the rescue mission will fail."
                );
            }
        }

        while (true) {
            System.out.print("> ");
            String inputO = scanner.nextLine().toLowerCase();
            if (inputO.contains("key") && (inputO.contains("read") || inputO.contains("look"))) {
                System.out.println("The following is written on the key, \"Room for Monalisa, 1509\".");

            } else if (inputO.contains("open")) {
                System.out.println(
                    "You have entered the room, Monalisa is right in front of you, and the rescue mission seems to be over. " +
                    "But suddenly, to your right, in the completely opposite direction of the Mona Lisa, " +
                    "you hear the faint cry of the kitten.\n"
                );
                System.out.println(
                    "At the moment, the flames have blackened the frame of the Mona Lisa,  " +
                    "and the painting inside also shows signs of having been set on fire.  " +
                    "Between the dying kitten and the Mona Lisa that is about to be consumed up by the flames, " +
                    "you can only make one choice..."
                );
                break;
            } else if (inputO.contains("quit") || inputO.contains("give up")) {
                System.out.println("You've exited from the game. Game over.");
                return;
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
                    "At the same time, the kitten died in agony......\n\n"
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
            } else {
                System.out.println("At this most critical moment, you must choose one of them and cannot escape.");
            }
        }
    }


    public static void main(String[] args) {
        new Game().startGame();
    }
}
