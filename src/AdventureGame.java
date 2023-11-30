import java.util.Scanner;
import java.util.Stack;

//public class AdventureGame {
//    private Stack<String> locationHistory = new Stack<>();
//    private Scanner scanner = new Scanner(System.in);
//
//    public void startGame() {
//        String currentLocation = "entrance";
//        locationHistory.push(currentLocation);
//
//        System.out.println("Welcome to the Adventure Game!");
//        while (true) {
//            System.out.println("You are at the " + currentLocation);
//            System.out.println("Where would you like to go? (type 'back' to return to the previous location)");
//
//            String[] availableLocations = {"entrance", "hall", "gallery", "exit"};
//            for (String location : availableLocations) {
//                if (!location.equals(currentLocation)) {
//                    System.out.println("- " + location);
//                }
//            }
//
//            String chosenLocation = scanner.nextLine().trim().toLowerCase();
//
//            if ("back".equals(chosenLocation)) {
//                if (locationHistory.size() > 1) {
//                    locationHistory.pop(); // Remove current location
//                    currentLocation = locationHistory.peek(); // Get previous location
//                } else {
//                    System.out.println("You are at the entrance, you cannot go back further.");
//                }
//            } else {
//                boolean validLocation = false;
//                for (String location : availableLocations) {
//                    if (location.equals(chosenLocation)) {
//                        validLocation = true;
//                        break;
//                    }
//                }
//
//                if (validLocation) {
//                    currentLocation = chosenLocation;
//                    locationHistory.push(currentLocation);
//                } else {
//                    System.out.println("That is not a valid location.");
//                }
//            }
//            if ("exit".equals(chosenLocation)) {
//                System.out.println("Exiting the game. Goodbye!");
//                break;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        new AdventureGame().startGame();
//    }
//}

import java.util.Scanner;

public class AdventureGame {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String currentLocation = "classroom"; // 初始位置设置为教室

        while (true) { // main loop
            switch (currentLocation) {
                case "classroom":
                    System.out.println("You are in the classroom. You can go 'right' to the office or 'left' to the exit.");
                    String classroomChoice = scanner.nextLine();
                    if ("right".equalsIgnoreCase(classroomChoice)) {
                        currentLocation = "office";
                    } else if ("left".equalsIgnoreCase(classroomChoice)) {
                        currentLocation = "exit";
                    } else {
                        System.out.println("That's not a valid direction. Try 'right' or 'left'.");
                    }
                    break;

                case "office":
                    System.out.println("You are in the office. You can go 'left' to return to the classroom.");
                    String officeChoice = scanner.nextLine();
                    if ("left".equalsIgnoreCase(officeChoice)) {
                        currentLocation = "classroom"; // 从办公室向左走回教室
                    } else {
                        System.out.println("You can't go that way from the office.");
                    }
                    break;

                case "exit":
                    System.out.println("You have found the exit. Type 'back' to go back to the classroom or 'exit' to leave the game.");
                    String exitChoice = scanner.nextLine();
                    if ("back".equalsIgnoreCase(exitChoice)) {
                        currentLocation = "classroom";
                    } else if ("exit".equalsIgnoreCase(exitChoice)) {
                        System.out.println("Thank you for playing!");
                        return; // 结束游戏
                    } else {
                        System.out.println("That's not a valid action. Try 'back' or 'exit'.");
                    }
                    break;

                default:
                    System.out.println("You are lost."); // 如果当前位置不明
                    return; // 结束游戏或者执行其他逻辑
            }
        }
    }
}


